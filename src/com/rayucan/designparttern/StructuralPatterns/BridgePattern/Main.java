package com.rayucan.designparttern.StructuralPatterns.BridgePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/7 23:28
 * 
 * 桥接模式
 */
public class Main {
    public static void main(String[] args) {
        Red red = new Red();
        
        Circle circle = new Circle();
        circle.setColor(red);
        circle.draw();

        Delta delta = new Delta();
        delta.setColor(red);
        delta.draw();
    }
}
