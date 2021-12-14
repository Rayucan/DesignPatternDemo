package com.rayucan.designparttern.CreationalPatterns.SingletonPattern.Hungry;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:55
 * 
 * 饿汉式
 * 
 * 虽然饿汉式没有加锁，但仍然是线程安全的
 * 且正是由于无锁，其效率较高
 * 
 * 然而，instance 在类加载时就进行了初始化，有可能浪费内存
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    
    public static Singleton getInstance(){
        return instance;
    }
}
