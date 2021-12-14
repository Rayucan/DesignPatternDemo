package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.factory;

import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color.Blue;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color.Color;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color.Red;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color.Yellow;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape.Shape;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:24
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color == null)
            return null;
        
        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }else if (color.equalsIgnoreCase("YELLOW")){
            return new Yellow();
        }else if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
