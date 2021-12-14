package com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern;

import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.color.Color;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.factory.AbstractFactory;
import com.rayucan.designparttern.CreationalPatterns.AbstractFactoryPattern.shape.Shape;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:27
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color yellow = colorFactory.getColor("YELLOW");
        yellow.fill();
    }
}
