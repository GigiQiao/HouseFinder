package result;
import entity.CommonProperties;
import form.RealEstateSearchResultUI;
import service.RealEstateService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
// create the search parameter that is the form for the search form
// which include the city list, max price text field, the property type list
public class Result extends JFrame {

   
    private RealEstateService service;
    private JComboBox<String> cityComboBox;// drop down list
    private JTextField maxPriceTextField;
    private JComboBox<String> typeComboBox;// drop down list
    private JButton searchButton;
    private JButton quitButton;// two buttons

   
    public Result() {
        initComponents();
        service = new RealEstateService();
    }

    //initial components of ui
     
    private void initComponents() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Search Parameters");
        
        JPanel centerPanel = new JPanel();

        Box citycombo = Box.createHorizontalBox();
        citycombo.add(Box.createHorizontalStrut(100));
        citycombo.add(new JLabel("City: "));
        citycombo.add(Box.createHorizontalStrut(20));
        cityComboBox = new JComboBox<String>();
        cityComboBox.addItem("stct");
        cityComboBox.addItem("wlld");
        cityComboBox.addItem("ngfl");
        cityComboBox.addItem("fter");
        cityComboBox.setPreferredSize(new Dimension(200, 40));
        cityComboBox.setSize(200, 40);
        citycombo.add(cityComboBox);
        citycombo.add(Box.createHorizontalStrut(100));
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(citycombo);

        Box maxpricebox = Box.createHorizontalBox();
        maxpricebox.add(Box.createHorizontalStrut(100));
        maxpricebox.add(new JLabel("Max Price: "));
        maxpricebox.add(Box.createHorizontalStrut(20));
        maxPriceTextField = new JTextField();
        maxPriceTextField.setPreferredSize(new Dimension(200, 40));
        maxPriceTextField.setSize(200, 40);
        maxpricebox.add(maxPriceTextField);
        maxpricebox.add(Box.createHorizontalStrut(100));
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(maxpricebox);

        Box typecombo = Box.createHorizontalBox();
        typecombo.add(Box.createHorizontalStrut(100));
        typecombo.add(new JLabel("Property Type: "));
        typecombo.add(Box.createHorizontalStrut(20));
        typeComboBox = new JComboBox<String>();
        typeComboBox.addItem("Commercial retail");
        typeComboBox.addItem("Commercial industrial");
        typeComboBox.addItem("residential");
        typeComboBox.addItem("farm");
       
        typeComboBox.setPreferredSize(new Dimension(200, 40));
        typeComboBox.setSize(200, 40);
        typecombo.add(typeComboBox);
        typecombo.add(Box.createHorizontalStrut(100));
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(typecombo);

        JPanel southPanel = new JPanel();
        Box box4 = Box.createHorizontalBox();
        searchButton = new JButton("Search");
        searchButton.setPreferredSize(new Dimension(80, 40));
        searchButton.setSize(80, 40);
        box4.add(searchButton);
        box4.add(Box.createHorizontalStrut(20));

        quitButton = new JButton("Quit");
        quitButton.setPreferredSize(new Dimension(80, 40));
        quitButton.setSize(80, 40);
        box4.add(quitButton);
        southPanel.add(box4);

        getContentPane().add("Center", centerPanel);
        getContentPane().add("South", southPanel);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            // return the choice from the drop down form that and the max price integer input from the form
            public void actionPerformed(ActionEvent e) {
                String city = (String) cityComboBox.getSelectedItem();
                int maxPrice = Integer.parseInt(maxPriceTextField.getText());
                String type = (String) typeComboBox.getSelectedItem();
                try { 
                    List<CommonProperties> data = service.searchData(city, maxPrice, type);
                    RealEstateSearchResultUI resultUI = new RealEstateSearchResultUI(data,type);
                    resultUI.setVisible(true);
                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }
        });
    }

    // main method
    public static void main(String[] args) {
        Result run = new Result();
        run.setVisible(true);
    }
}
