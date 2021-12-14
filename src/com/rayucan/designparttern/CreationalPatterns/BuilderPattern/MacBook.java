package com.rayucan.designparttern.CreationalPatterns.BuilderPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:27
 */
public class MacBook extends Computer{
    protected MacBook(){}
    
    @Override
    public void setOs() {
        os = "macOS";
    }
}
