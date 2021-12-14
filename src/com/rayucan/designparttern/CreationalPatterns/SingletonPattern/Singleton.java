package com.rayucan.designparttern.CreationalPatterns.SingletonPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:40
 */
public class Singleton {
    //构造函数私有化
    private Singleton(){}
    //静态实例
    private static Singleton instance;
    
    //懒汉式，非线程安全
    //懒汉：第一次调用才初始化
    public static Singleton getInstance_Lazy_NotSafe(){
        if (instance == null)
            return new Singleton();
        
        return instance;
    }
    //懒汉式，线程安全
    public static synchronized Singleton getInstance_Lazy_Safe(){
        if (instance == null)
            return new Singleton();
        
        return instance;
    }
    
    //饿汉式，参考 SingleObject
    
    
}
