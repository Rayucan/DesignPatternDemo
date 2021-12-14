package com.rayucan.designparttern.CreationalPatterns.BuilderPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:22
 */
public abstract class Computer {
    protected String cpu;
    protected String gpu;
    protected String os;
    
    protected Computer(){}
    
    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
