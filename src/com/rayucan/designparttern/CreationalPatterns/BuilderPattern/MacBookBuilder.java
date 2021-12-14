package com.rayucan.designparttern.CreationalPatterns.BuilderPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:29
 */
public class MacBookBuilder extends Builder{
    
    private Computer computer = new MacBook();
    
    @Override
    void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    void buildGpu(String gpu) {
        computer.setGpu(gpu);
    }

    @Override
    void buildOs() {
        computer.setOs();
    }

    @Override
    Computer build() {
        return computer;
    }
}
