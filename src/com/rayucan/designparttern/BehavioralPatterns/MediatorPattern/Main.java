package com.rayucan.designparttern.BehavioralPatterns.MediatorPattern;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 19:04
 */
public class Main {
    public static void main(String[] args) {
        new OrderFrame("Hamburger","Nugget", "Chip", "Coffee");
    }
}

class OrderFrame extends JFrame{
    public OrderFrame(String... names){
        setTitle("Order");
        setSize(460, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
        c.add(new JLabel("Using Mediator Pattern"));
        List<JCheckBox> checkBoxList = addCheckBox(names);
        JButton selectAll = addButton("Select All");
        JButton selectNone = addButton("Select None");
        selectNone.setEnabled(false);
        JButton selectInverse = addButton("Inverse Select");
        new Mediator(checkBoxList, selectAll, selectNone, selectInverse);
        setVisible(true);
    }
    
    private List<JCheckBox> addCheckBox(String... names){
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel("Menu:"));
        List<JCheckBox> list = new ArrayList<>();
        for (String name : names) {
            JCheckBox jCheckBox = new JCheckBox(name);
            list.add(jCheckBox);
            jPanel.add(jCheckBox);
        }
        
        getContentPane().add(jPanel);
        return list;
    }
    
    private JButton addButton(String label){
        JButton jButton = new JButton(label);
        getContentPane().add(jButton);
        return jButton;
    }
}
