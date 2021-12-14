package com.rayucan.designparttern.CreationalPatterns.BuilderPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:30
 */
public class Director {
    Builder builder = null;
    
    public Director(Builder builder){
        this.builder = builder;
    }
    
    public void construct(String cpu, String gpu){
        builder.buildCpu(cpu);
        builder.buildGpu(gpu);
        builder.buildOs();
    }
}
