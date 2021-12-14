package com.rayucan.designparttern.CreationalPatterns.PrototypePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:58
 */
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());
        clonedShape.draw();
    }
}
