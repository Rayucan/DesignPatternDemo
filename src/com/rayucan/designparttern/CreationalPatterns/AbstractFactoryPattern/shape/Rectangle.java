package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:17
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle draw method");
    }
}
