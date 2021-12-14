package com.rayucan.designparttern.CreationalPatterns.SingletonPattern.LazyNotSafe;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:52
 * 
 * 非线程安全懒汉式
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    
    public static Singleton getInstance(){
        if (instance == null)
            return new Singleton();
        
        return instance;
    }
}
