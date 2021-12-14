package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.factory;

import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color.Color;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape.Circle;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape.Rectangle;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape.Shape;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape.Square;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:22
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;
        
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        
        return null;
    }
}
