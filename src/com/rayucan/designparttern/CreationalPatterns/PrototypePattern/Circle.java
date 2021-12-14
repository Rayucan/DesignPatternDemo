package com.rayucan.designparttern.CreationalPatterns.PrototypePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:50
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    
    @Override
    void draw() {
        System.out.println("Circle draw method");
    }
}
