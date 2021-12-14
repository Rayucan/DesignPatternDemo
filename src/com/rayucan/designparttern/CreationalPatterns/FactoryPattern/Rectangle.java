package com.rayucan.designparttern.CreationalPatterns.FactoryPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/11/5 11:40
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle draw()");
    }
}
