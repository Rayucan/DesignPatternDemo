package com.rayucan.designparttern.CreationalPatterns.SingletonPattern.LazySafe;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:53
 * 
 * 线程安全懒汉式
 * 
 * 这种方式很好实现了懒加载，且能在多线程环境下工作
 * 第一次调用才初始化，避免了内存浪费
 * 
 * 然而，synchronized 重量锁严重影响了执行效率，很多情况下并不需要同步
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    
    public static synchronized Singleton getInstance(){
        if (instance == null)
            return new Singleton();
        
        return instance;
    }
}
