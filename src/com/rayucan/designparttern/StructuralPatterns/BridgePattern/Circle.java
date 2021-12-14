package com.rayucan.designparttern.StructuralPatterns.BridgePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/7 23:26
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        color.paint("圆");
    }
}
