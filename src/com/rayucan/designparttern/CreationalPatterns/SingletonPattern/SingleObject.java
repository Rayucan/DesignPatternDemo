package com.rayucan.designparttern.CreationalPatterns.SingletonPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:31
 */
public class SingleObject {
    //构造函数私有化
    private SingleObject(){}
    
    //静态实例
    private static SingleObject instance = new SingleObject();
    
    public static SingleObject getInstance(){
        return instance;
    }
    
    public void sayHello(){
        System.out.println("Hello!!!");
    }
}
