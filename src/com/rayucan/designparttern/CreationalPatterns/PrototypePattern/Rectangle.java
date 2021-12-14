package com.rayucan.designparttern.CreationalPatterns.PrototypePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:49
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    
    @Override
    void draw() {
        System.out.println("Rectangle draw method");
    }
}
