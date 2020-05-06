package form;

import entity.CommercialIndustrial;
import entity.CommonProperties;
import entity.Factory;

import javax.swing.*;
import java.awt.*;
// create the result of the form for industrial type with all the information included in the common panel
// including type text field, crane text field, equipment text field, railway access text field
// solution form
public class IndustrialPanel extends CommonPanel {

    private JTextField typeTextField;
    private JTextField craneTextField;
    private JTextField equipmentTextField;
    private JTextField railwayAccessTextField;

    public IndustrialPanel() {
        super();
        initUI();
    }

   // init ui
    private void initUI() {
        Box typebox = Box.createHorizontalBox();
        typebox.add(Box.createHorizontalStrut(100));
        typebox.add(new JLabel("Industry Type: "));
        typebox.add(Box.createHorizontalStrut(20));
        typeTextField = new JTextField();
        typeTextField.setPreferredSize(new Dimension(200, 30));
        typeTextField.setSize(200, 30);
        typebox.add(typeTextField);
        typebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(typebox);

        Box cranebox = Box.createHorizontalBox();
        cranebox.add(Box.createHorizontalStrut(100));
        cranebox.add(new JLabel("Crane: "));
        cranebox.add(Box.createHorizontalStrut(20));
        craneTextField = new JTextField();
        craneTextField.setPreferredSize(new Dimension(200, 30));
        craneTextField.setSize(200, 30);
        cranebox.add(craneTextField);
        cranebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(cranebox);

        Box equipbox = Box.createHorizontalBox();
        equipbox.add(Box.createHorizontalStrut(100));
        equipbox.add(new JLabel("Equipment: "));
        equipbox.add(Box.createHorizontalStrut(20));
        equipmentTextField = new JTextField();
        equipmentTextField.setPreferredSize(new Dimension(200, 30));
        equipmentTextField.setSize(200, 30);
        equipbox.add(equipmentTextField);
        equipbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(equipbox);

        Box railbox = Box.createHorizontalBox();
        railbox.add(Box.createHorizontalStrut(100));
        railbox.add(new JLabel("Rail access: "));
        railbox.add(Box.createHorizontalStrut(20));
        railwayAccessTextField = new JTextField();
        railwayAccessTextField.setPreferredSize(new Dimension(200, 30));
        railwayAccessTextField.setSize(200, 30);
        railbox.add(railwayAccessTextField);
        railbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(railbox);
    }


    @Override
    public void displayData(CommonProperties property) {
        CommercialIndustrial industrial = (CommercialIndustrial) property;
        typeTextField.setText(industrial.getType());
        Factory factory = (Factory) industrial.getBuilding();
        craneTextField.setText(factory.isCrane() ? "Yes" : "No");
        equipmentTextField.setText(factory.isEquipment() ? "Yes" : "No");
        railwayAccessTextField.setText(factory.isRailwayAccess() ? "Yes" : "No");
        super.displayData(property);
    }

    @Override
    public void clearData() {
        super.clearData();
        typeTextField.setText(null);
        craneTextField.setText(null);
        equipmentTextField.setText(null);
        railwayAccessTextField.setText(null);
    }
}
