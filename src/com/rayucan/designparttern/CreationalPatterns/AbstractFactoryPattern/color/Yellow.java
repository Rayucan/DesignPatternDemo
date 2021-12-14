package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:20
 */
public class Yellow implements Color{
    @Override
    public void fill() {
        System.out.println("Yellow fill method");
    }
}
