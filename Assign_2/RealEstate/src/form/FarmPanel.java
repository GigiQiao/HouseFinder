package form;

import entity.CommonProperties;
import entity.Farm;

import javax.swing.*;
import java.awt.*;

public class FarmPanel extends ResidentialPanel {

    private JTextField typeTextField;
// this create the result form for the farm and all the information has in the residential panel
    // which include the farm type text field
    // solution form
    public FarmPanel() {
        super();
        // init ui;
        Box typebox = Box.createHorizontalBox();
        typebox.add(Box.createHorizontalStrut(100));
        typebox.add(new JLabel("Farm Type: "));
        typebox.add(Box.createHorizontalStrut(20));
        typeTextField = new JTextField();
        typeTextField.setPreferredSize(new Dimension(200, 30));
        typeTextField.setSize(200, 30);
        typebox.add(typeTextField);
        typebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(typebox);
    }

    @Override
    public void displayData(CommonProperties property) {
        super.displayData(property);
        Farm farm = (Farm) property;
        typeTextField.setText(farm.getType());
    }

    @Override
    public void clearData() {
        super.clearData();
        typeTextField.setText(null);
    }
}
