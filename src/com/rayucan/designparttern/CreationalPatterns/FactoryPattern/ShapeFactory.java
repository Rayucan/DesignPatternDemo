package com.rayucan.designparttern.CreationalPatterns.FactoryPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/11/5 11:42
 */
public class ShapeFactory {
    public Shape getShape(String type){
        if (type == null)
            return null;
        
        if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if (type.equalsIgnoreCase("square")){
            return new Square();
        }
        
        return null;
    }
}
