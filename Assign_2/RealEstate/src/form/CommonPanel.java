package form;


import entity.Building;
import entity.CommonProperties;

import javax.swing.*;
import java.awt.*;

public class CommonPanel extends JPanel {

    private JTextField taxTextField;
    private JTextField priceTextField;
    private JTextField sizeTextField;
    private JTextField cityTextField;
    private JTextField materialTextField;
    private JTextField buildingSizeTextField;

   
    public CommonPanel() {
        initComponents();
    }

 // create a form that has tax text field, price text field, size text field, city text field, material text field, building size text field
    //these are the field that all the result have no matter what propertype they are
    // solution form
    private void initComponents() {
        Box taxbox = Box.createHorizontalBox();
        taxbox.add(Box.createHorizontalStrut(100));
        taxbox.add(new JLabel("Taxes: "));
        taxbox.add(Box.createHorizontalStrut(20));
        taxTextField = new JTextField();
        taxTextField.setPreferredSize(new Dimension(200, 30));
        taxTextField.setSize(200, 30);
        taxbox.add(taxTextField);
        taxbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(taxbox);

        Box pricebox = Box.createHorizontalBox();
        pricebox.add(Box.createHorizontalStrut(100));
        pricebox.add(new JLabel("Price: "));
        pricebox.add(Box.createHorizontalStrut(20));
        priceTextField = new JTextField();
        priceTextField.setPreferredSize(new Dimension(200, 30));
        priceTextField.setSize(200, 30);
        pricebox.add(priceTextField);
        pricebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(pricebox);

        Box sizebox = Box.createHorizontalBox();
        sizebox.add(Box.createHorizontalStrut(100));
        sizebox.add(new JLabel("Lot Size: "));
        sizebox.add(Box.createHorizontalStrut(20));
        sizeTextField = new JTextField();
        sizeTextField.setPreferredSize(new Dimension(200, 30));
        sizeTextField.setSize(200, 30);
        sizebox.add(sizeTextField);
        sizebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(sizebox);

        Box citybox = Box.createHorizontalBox();
        citybox.add(Box.createHorizontalStrut(100));
        citybox.add(new JLabel("City: "));
        citybox.add(Box.createHorizontalStrut(20));
        cityTextField = new JTextField();
        cityTextField.setPreferredSize(new Dimension(200, 30));
        cityTextField.setSize(200, 30);
        citybox.add(cityTextField);
        citybox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(citybox);

        Box materialbox = Box.createHorizontalBox();
        materialbox.add(Box.createHorizontalStrut(100));
        materialbox.add(new JLabel("Material: "));
        materialbox.add(Box.createHorizontalStrut(20));
        materialTextField = new JTextField();
        materialTextField.setPreferredSize(new Dimension(200, 30));
        materialTextField.setSize(200, 30);
        materialbox.add(materialTextField);
        materialbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(materialbox);

        Box buildingbox = Box.createHorizontalBox();
        buildingbox.add(Box.createHorizontalStrut(100));
        buildingbox.add(new JLabel("Buiding Size: "));
        buildingbox.add(Box.createHorizontalStrut(20));
        buildingSizeTextField = new JTextField();
        buildingSizeTextField.setPreferredSize(new Dimension(200, 30));
        buildingSizeTextField.setSize(200, 30);
        buildingbox.add(buildingSizeTextField);
        buildingbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(buildingbox);
    }

  // when has the result,it shows the information on the text field
    public void displayData(CommonProperties property) {
        taxTextField.setText(String.valueOf(property.getPropertyTaxes() ));
        priceTextField.setText(String.valueOf(property.getPrice() ));
        sizeTextField.setText(String.valueOf(property.getSize()));
        cityTextField.setText(property.getLocation());
        Building building = property.getBuilding();
        materialTextField.setText(building.getConstructionMaterial());
        buildingSizeTextField.setText(String.valueOf(building.getSize()) );
    }
// clear all the data
    public void clearData() {
        taxTextField.setText("No more Properties to Display");
        priceTextField.setText(null);
        sizeTextField.setText(null);
        cityTextField.setText(null);
        materialTextField.setText(null);
        buildingSizeTextField.setText(null);
    }
}
