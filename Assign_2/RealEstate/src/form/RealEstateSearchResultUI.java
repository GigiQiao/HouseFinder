package form;

import entity.CommonProperties;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
// display the system by ui
// this class is to choose if the result belongs to commercial retail, then return the commercial retail result form
// when the result belongs  to the commercial industrial, then return the commercial industrial result form
// when the result belongs to the residential, then return the residential result form
// when the result belongs to the farm, then return the farm result form

public class RealEstateSearchResultUI extends JFrame {

    private List<CommonProperties> data;// all data
    private int index;// the index of the data list
    private CommonPanel centerPanel;// display panel
    private JButton nextButton;
    private JButton quitButton;// two buttons on the result form

   
    public RealEstateSearchResultUI(List<CommonProperties> data, String type) {
        this.data = data;
        //init center panel
        if ("Commercial retail".equals(type)) {
            centerPanel = new RetailPanel();
        } else if ("Commercial industrial".equals(type)) {
            centerPanel = new IndustrialPanel();
        } else if ("residential".equals(type)) {
            centerPanel = new ResidentialPanel();
        } else if ("farm".equals(type)) {
            centerPanel = new FarmPanel();
        }
        initComponents();
        displayData();

    }

   // it create the form for the search result
    private void initComponents() {
        setSize(500, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Search Result");


        JPanel southPanel = new JPanel();
        Box boxNext = Box.createHorizontalBox();
        nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(80, 40));
        nextButton.setSize(80, 40);
        boxNext.add(nextButton);
        boxNext.add(Box.createHorizontalStrut(20));

        quitButton = new JButton("Quit");
        quitButton.setPreferredSize(new Dimension(80, 40));
        quitButton.setSize(80, 40);
        boxNext.add(quitButton);
        southPanel.add(boxNext);

        getContentPane().add("Center", centerPanel);
        getContentPane().add("South", southPanel);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                index++;
                displayData();
            }
        });
    }

   //display all the data
    private void displayData() {
        if(index >= data.size())
        {
            centerPanel.clearData();
        }
        else
        {
            centerPanel.displayData(data.get(index));
        }
    }

}
