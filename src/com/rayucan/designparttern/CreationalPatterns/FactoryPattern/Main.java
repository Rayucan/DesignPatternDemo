package com.rayucan.designparttern.CreationalPatterns.FactoryPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/11/5 11:44
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
