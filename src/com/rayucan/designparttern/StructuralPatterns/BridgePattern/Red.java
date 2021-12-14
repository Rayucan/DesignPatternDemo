package com.rayucan.designparttern.StructuralPatterns.BridgePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/7 23:25
 */
public class Red implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("红的" + shape);
    }
}
