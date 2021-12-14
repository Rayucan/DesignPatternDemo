package com.rayucan.designparttern.CreationalPatterns.BuilderPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:28
 */
public abstract class Builder {
    abstract void buildCpu(String cpu);
    abstract void buildGpu(String gpu);
    abstract void buildOs();
    abstract Computer build();
}
