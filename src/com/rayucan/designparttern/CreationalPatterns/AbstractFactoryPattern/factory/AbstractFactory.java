package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.factory;

import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color.Color;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape.Shape;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:21
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
