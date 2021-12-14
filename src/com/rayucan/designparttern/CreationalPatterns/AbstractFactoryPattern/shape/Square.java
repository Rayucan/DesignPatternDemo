package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:18
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square draw method");
    }
}
