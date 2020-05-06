package service;

import entity.CommercialIndustrial;
import entity.CommercialRetail;
import entity.CommonProperties;
import entity.Factory;
import entity.Farm;
import entity.House;
import entity.Residential;
import entity.Store;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// this is to read all the data from the file and make the match for the search
public class RealEstateService {

    //default file name
    private static String dataFile = "real.txt";
    private List<CommonProperties> properties;// all property
    private char buildingType;
    private char proptype;

    
    public RealEstateService() {
        loadData(dataFile);
    }

 
    public void loadData(String fileName) {
        properties = initData(fileName);
    }

    private List<CommonProperties> initData(String fileName) {
        List<CommonProperties> data = new ArrayList<CommonProperties>();
        Scanner in = null;
        try {
            in = new Scanner(new FileInputStream(fileName));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tempArray = line.split("\t");
               buildingType = tempArray[0].charAt(0);
                if (buildingType =='s') {
                    Store store = new Store();
                    store.setSize(Integer.parseInt(tempArray[1]));
                    store.setConstructionMaterial(tempArray[2]);
                    store.setShelves("y".equals(tempArray[3]));
                    store.setCheckout("y".equals(tempArray[4]));
                    store.setSafe("y".equals(tempArray[5]));

                    CommercialRetail retail = new CommercialRetail();
                    retail.setPropertyTaxes(Integer.parseInt(tempArray[7]));
                    retail.setPrice(Integer.parseInt(tempArray[8]));
                    retail.setSize(Integer.parseInt(tempArray[9]));
                    retail.setLocation(tempArray[10]);
                    retail.setType(tempArray[11]);
                    retail.setBuilding(store);

                    data.add(retail);
                } else if (buildingType =='f') {
                    Factory factory = new Factory();
                    factory.setSize(Integer.parseInt(tempArray[1]));
                    factory.setConstructionMaterial(tempArray[2]);
                    factory.setCrane("y".equals(tempArray[3]));
                    factory.setEquipment("y".equals(tempArray[4]));
                    factory.setRailwayAccess("y".equals(tempArray[5]));

                    CommercialIndustrial industrial = new CommercialIndustrial();
                    industrial.setPropertyTaxes(Integer.parseInt(tempArray[7]));
                    industrial.setPrice(Integer.parseInt(tempArray[8]));
                    industrial.setSize(Integer.parseInt(tempArray[9]));
                    industrial.setLocation(tempArray[10]);
                    industrial.setType(tempArray[11]);
                    industrial.setBuilding(factory);

                    data.add(industrial);
                } else if (buildingType =='h') {
                    House house = new House();
                    house.setSize(Integer.parseInt(tempArray[1]));
                    house.setConstructionMaterial(tempArray[2]);
                    house.setType(tempArray[3]);
                    house.setBedrooms(Integer.parseInt(tempArray[4]));
                    house.setBathrooms(Integer.parseInt(tempArray[5]));
                    house.setBasement("y".equals(tempArray[6]));
                    proptype = tempArray[7].charAt(0);
                    if (proptype =='r') {
                        Residential residential = new Residential();
                        residential.setPropertyTaxes(Integer.parseInt(tempArray[8]));
                        residential.setPrice(Integer.parseInt(tempArray[9]));
                        residential.setSize(Integer.parseInt(tempArray[10]));
                        residential.setLocation(tempArray[11]);
                        residential.setSewer("y".equals(tempArray[12]));
                        residential.setWater("y".equals(tempArray[13]));
                        residential.setGarage("y".equals(tempArray[14]));
                        residential.setPool("y".equals(tempArray[15]));
                        residential.setBuilding(house);
                        data.add(residential);
                    } else {
                        Farm farm = new Farm();
                        farm.setPropertyTaxes(Integer.parseInt(tempArray[8]));
                        farm.setPrice(Integer.parseInt(tempArray[9]));
                        farm.setSize(Integer.parseInt(tempArray[10]));
                        farm.setLocation(tempArray[11]);
                        farm.setSewer("y".equals(tempArray[12]));
                        farm.setWater("y".equals(tempArray[13]));
                        farm.setGarage("y".equals(tempArray[14]));
                        farm.setPool("y".equals(tempArray[15]));
                        farm.setType(tempArray[16]);
                        farm.setBuilding(house);
                        data.add(farm);
                    }
                } else {
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }

        return data;
    }

    public List<CommonProperties> searchData(String city, int maxPrice, String type) {
        List<CommonProperties> result = new ArrayList<CommonProperties>();
        List<CommonProperties> tempResult = new ArrayList<CommonProperties>();
        for (CommonProperties property : properties) {
            if ("Commercial retail".equals(type) && property instanceof CommercialRetail) {
                tempResult.add(property);
            } else if ("Commercial industrial".equals(type) && property instanceof CommercialIndustrial) {
                tempResult.add(property);
            } else if ("residential".equals(type) && property instanceof Residential) {
                tempResult.add(property);
            } else if ("farm".equals(type) && property instanceof Farm) {
                tempResult.add(property);
            }
        }

        for (CommonProperties property : tempResult) {
            if (city.equals(property.getLocation()) && maxPrice >= property.getPrice()) {
                result.add(property);
            }
        }

        return result;
    }

}
