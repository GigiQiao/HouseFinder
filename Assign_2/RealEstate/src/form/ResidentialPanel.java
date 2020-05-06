package form;

import entity.CommonProperties;
import entity.House;
import entity.Residential;

import javax.swing.*;
import java.awt.*;
// create the form for return residential type of result, include all the information in the common panel
// this form include the sewer text field, water text field, garage text field, pool text field, bedrooms text field, bathrooms text field, basement text field and house type text field
public class ResidentialPanel extends CommonPanel {

    private JTextField sewerTextField;
    private JTextField waterTextField;
    private JTextField garageTextField;
    private JTextField poolTextField;
    private JTextField bedroomsTextField;
    private JTextField bathroomsTextField;
    private JTextField basementTextField;
    private JTextField houseTypeTextField;

    /**
     * default constructor
     */
    public ResidentialPanel() {
        super();
        initUI();
    }

    /**
     * init ui
     */
    private void initUI() {
        Box sewerbox = Box.createHorizontalBox();
        sewerbox.add(Box.createHorizontalStrut(100));
        sewerbox.add(new JLabel("Sewer: "));
        sewerbox.add(Box.createHorizontalStrut(20));
        sewerTextField = new JTextField();
        sewerTextField.setPreferredSize(new Dimension(200, 30));
        sewerTextField.setSize(200, 30);
        sewerbox.add(sewerTextField);
        sewerbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(sewerbox);

        Box waterbox = Box.createHorizontalBox();
        waterbox.add(Box.createHorizontalStrut(100));
        waterbox.add(new JLabel("Water: "));
        waterbox.add(Box.createHorizontalStrut(20));
        waterTextField = new JTextField();
        waterTextField.setPreferredSize(new Dimension(200, 30));
        waterTextField.setSize(200, 30);
        waterbox.add(waterTextField);
        waterbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(waterbox);

        Box garagebox = Box.createHorizontalBox();
        garagebox.add(Box.createHorizontalStrut(100));
        garagebox.add(new JLabel("Garage: "));
        garagebox.add(Box.createHorizontalStrut(20));
        garageTextField = new JTextField();
        garageTextField.setPreferredSize(new Dimension(200, 30));
        garageTextField.setSize(200, 30);
        garagebox.add(garageTextField);
        garagebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(garagebox);

        Box poolbox = Box.createHorizontalBox();
        poolbox.add(Box.createHorizontalStrut(100));
        poolbox.add(new JLabel("Pool: "));
        poolbox.add(Box.createHorizontalStrut(20));
        poolTextField = new JTextField();
        poolTextField.setPreferredSize(new Dimension(200, 30));
        poolTextField.setSize(200, 30);
        poolbox.add(poolTextField);
        poolbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(poolbox);

        Box bedroomsbox = Box.createHorizontalBox();
        bedroomsbox.add(Box.createHorizontalStrut(100));
        bedroomsbox.add(new JLabel("Bedrooms: "));
        bedroomsbox.add(Box.createHorizontalStrut(20));
        bedroomsTextField = new JTextField();
        bedroomsTextField.setPreferredSize(new Dimension(200, 30));
        bedroomsTextField.setSize(200, 30);
        bedroomsbox.add(bedroomsTextField);
        bedroomsbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(bedroomsbox);

        Box bathroomsbox = Box.createHorizontalBox();
        bathroomsbox.add(Box.createHorizontalStrut(100));
        bathroomsbox.add(new JLabel("Bathrooms: "));
        bathroomsbox.add(Box.createHorizontalStrut(20));
        bathroomsTextField = new JTextField();
        bathroomsTextField.setPreferredSize(new Dimension(200, 30));
        bathroomsTextField.setSize(200, 30);
        bathroomsbox.add(bathroomsTextField);
        bathroomsbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(bathroomsbox);

        Box basementbox = Box.createHorizontalBox();
        basementbox.add(Box.createHorizontalStrut(100));
        basementbox.add(new JLabel("Basement: "));
        basementbox.add(Box.createHorizontalStrut(20));
        basementTextField = new JTextField();
        basementTextField.setPreferredSize(new Dimension(200, 30));
        basementTextField.setSize(200, 30);
        basementbox.add(basementTextField);
        basementbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(basementbox);

        Box housebox = Box.createHorizontalBox();
        housebox.add(Box.createHorizontalStrut(100));
        housebox.add(new JLabel("House Type: "));
        housebox.add(Box.createHorizontalStrut(20));
        houseTypeTextField = new JTextField();
        houseTypeTextField.setPreferredSize(new Dimension(200, 30));
        houseTypeTextField.setSize(200, 30);
        housebox.add(houseTypeTextField);
        housebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(housebox);
    }

    @Override
    public void displayData(CommonProperties property) {
        super.displayData(property);
        Residential residential = (Residential) property;
        sewerTextField.setText(residential.isSewer() ? "Yes" : "No");
        waterTextField.setText(residential.isWater() ? "Yes" : "No");
        garageTextField.setText(residential.isGarage() ? "Yes" : "No");
        poolTextField.setText(residential.isPool() ? "Yes" : "No");
        House house = (House) property.getBuilding();
        bedroomsTextField.setText(String.valueOf(house.getBedrooms() ));
        bathroomsTextField.setText(String.valueOf(house.getBathrooms()));
        basementTextField.setText(house.isBasement() ? "Yes" : "No");
        houseTypeTextField.setText(house.getType());
    }

    @Override
    public void clearData() {
        super.clearData();
        sewerTextField.setText(null);
        waterTextField.setText(null);
        garageTextField.setText(null);
        poolTextField.setText(null);
        bedroomsTextField.setText(null);
        bathroomsTextField.setText(null);
        basementTextField.setText(null);
        houseTypeTextField.setText(null);
    }
}
