package form;


import entity.CommercialRetail;
import entity.CommonProperties;
import entity.Store;

import javax.swing.*;
import java.awt.*;
//create the result form for the retail type include the all information in the common panel
// this panel include type text field, shelves text field, checkout text field, safe text field
public class RetailPanel extends CommonPanel {

    private JTextField typeTextField;
    private JTextField shelvesTextField;
    private JTextField checkoutTextField;
    private JTextField safeTextField;

    public RetailPanel() {
        initUI();
    }

    //init ui
    private void initUI() {
        Box retailbox = Box.createHorizontalBox();
        retailbox.add(Box.createHorizontalStrut(100));
        retailbox.add(new JLabel("Retail Type: "));
        retailbox.add(Box.createHorizontalStrut(20));
        typeTextField = new JTextField();
        typeTextField.setPreferredSize(new Dimension(200, 30));
        typeTextField.setSize(200, 30);
        retailbox.add(typeTextField);
        retailbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(retailbox);

        Box shelvesbox = Box.createHorizontalBox();
        shelvesbox.add(Box.createHorizontalStrut(100));
        shelvesbox.add(new JLabel("Shelves: "));
        shelvesbox.add(Box.createHorizontalStrut(20));
        shelvesTextField = new JTextField();
        shelvesTextField.setPreferredSize(new Dimension(200, 30));
        shelvesTextField.setSize(200, 30);
        shelvesbox.add(shelvesTextField);
        shelvesbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(shelvesbox);

        Box checkoutbox = Box.createHorizontalBox();
        checkoutbox.add(Box.createHorizontalStrut(100));
        checkoutbox.add(new JLabel("Checkout: "));
        checkoutbox.add(Box.createHorizontalStrut(20));
        checkoutTextField = new JTextField();
        checkoutTextField.setPreferredSize(new Dimension(200, 30));
        checkoutTextField.setSize(200, 30);
        checkoutbox.add(checkoutTextField);
        checkoutbox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(checkoutbox);

        Box safebox = Box.createHorizontalBox();
        safebox.add(Box.createHorizontalStrut(100));
        safebox.add(new JLabel("Safe: "));
        safebox.add(Box.createHorizontalStrut(20));
        safeTextField = new JTextField();
        safeTextField.setPreferredSize(new Dimension(200, 30));
        safeTextField.setSize(200, 30);
        safebox.add(safeTextField);
        safebox.add(Box.createHorizontalStrut(100));
        this.add(Box.createVerticalStrut(10));
        this.add(safebox);
    }

    @Override
    public void displayData(CommonProperties property) {
        CommercialRetail retail = (CommercialRetail) property;
        typeTextField.setText(retail.getType());
        Store store = (Store) retail.getBuilding();
        shelvesTextField.setText(store.isShelves() ? "Yes" : "No");
        checkoutTextField.setText(store.isCheckout() ? "Yes" : "No");
        safeTextField.setText(store.isSafe() ? "Yes" : "No");
        super.displayData(property);
    }

    @Override
    public void clearData() {
        typeTextField.setText("");
        shelvesTextField.setText("");
        checkoutTextField.setText("");
        safeTextField.setText("");
        super.clearData();
    }
}
