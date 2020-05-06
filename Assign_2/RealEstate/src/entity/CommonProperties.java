 package entity;

//common properties returns the common properties for all
 // it includes integer price, integer tax, integer lotsize, string location (city in the form)
public class CommonProperties {
    
    private int propertyTaxes;
    private int price;
    private int size;
    private String location;
    private Building building;

    public int getPropertyTaxes() {
        return propertyTaxes;
    }

    public void setPropertyTaxes(int propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }


}
