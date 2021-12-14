package com.rayucan.designparttern.StructuralPatterns.BridgePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/7 23:25
 */
public class Yellow implements Color{
    @Override
    public void paint(String shape) {
        System.out.println("黄的" + shape);
    }
}
