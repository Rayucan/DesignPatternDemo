package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:21
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Blue fill method");
    }
}
