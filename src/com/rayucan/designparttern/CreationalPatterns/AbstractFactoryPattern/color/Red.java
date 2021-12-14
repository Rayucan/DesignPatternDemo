package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:19
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Red fill method");
    }
}
