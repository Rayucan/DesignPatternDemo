package com.rayucan.designparttern.BehavioralPatterns.MediatorPattern;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 19:13
 */
public class Mediator {
    private List<JCheckBox> checkBoxList;
    private JButton selectAll;
    private JButton selectNone;
    private JButton selectInverse;

    public Mediator(List<JCheckBox> checkBoxList, JButton selectAll, JButton selectNone, JButton selectInverse) {
        this.checkBoxList = checkBoxList;
        this.selectAll = selectAll;
        this.selectNone = selectNone;
        this.selectInverse = selectInverse;
        
        this.checkBoxList.forEach(checkBox -> {
            checkBox.addChangeListener(this::onCheckBoxChanged);
        });
        
        this.selectAll.addActionListener(this::onSelectAllClicked);
        this.selectNone.addActionListener(this::onSelectNoneClicked);
        this.selectInverse.addActionListener(this::onSelectInverseClicked);
    }
    
    public void onCheckBoxChanged(ChangeEvent event){
        boolean allChecked = true;
        boolean allUnchecked = true;

        for (var checkBox : checkBoxList) {
            if (checkBox.isSelected()){
                allUnchecked = false;
            }else {
                allChecked = false;
            }
        }
        
        selectAll.setEnabled(!allChecked);
        selectNone.setEnabled(!allUnchecked);
    }
    
    public void onSelectAllClicked(ActionEvent event){
        checkBoxList.forEach(checkBox -> checkBox.setSelected(true));
        selectAll.setEnabled(false);
        selectNone.setEnabled(true);
    }
    
    public void onSelectNoneClicked(ActionEvent event){
        checkBoxList.forEach(checkBox -> checkBox.setSelected(false));
        selectAll.setEnabled(true);
        selectNone.setEnabled(false);
    }
    
    public void onSelectInverseClicked(ActionEvent event){
        checkBoxList.forEach(checkBox -> checkBox.setSelected(!checkBox.isSelected()));
        onCheckBoxChanged(null);
    }
}
