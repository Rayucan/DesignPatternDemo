package com.rayucan.designparttern.CreationalPatterns.BuilderPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:32
 */
public class Main {
    public static void main(String[] args) {
        //建造者（工人）
        Builder builder = new MacBookBuilder();
        //监工
        Director director = new Director(builder);
        
        director.construct("Apple M1","Intel");
        
        Computer computer = builder.build();
        
        System.out.println(computer);
    }
}
