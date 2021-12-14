package com.rayucan.designparttern.StructuralPatterns.BridgePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/7 23:23
 */
public abstract class Shape {
    Color color;
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public abstract void draw();
}
