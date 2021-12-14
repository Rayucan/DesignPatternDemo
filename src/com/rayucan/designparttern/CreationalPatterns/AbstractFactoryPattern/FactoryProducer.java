package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern;

import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.factory.AbstractFactory;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.factory.ColorFactory;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.factory.ShapeFactory;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:26
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (factory.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        
        return null;
    }
}
