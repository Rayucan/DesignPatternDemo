package com.rayucan.designparttern.CreationalPatterns.PrototypePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:51
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square draw method");
    }
}
