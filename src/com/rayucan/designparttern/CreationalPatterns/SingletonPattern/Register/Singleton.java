package com.rayucan.designparttern.CreationalPatterns.SingletonPattern.Register;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 21:57
 * 
 * 登记式 / 静态内部类
 * 
 * 懒加载，线程安全
 * 这种方式利用了 ClassLoader 机制来保证初始化 instance 时只有一个线程执行(具体看 JVM 源码,loadClass 上锁)
 * 
 * 静态内部类只有被使用时才会被加载
 * 即调用 getInstance 方法时才会调用 SingletonHolder
 * 通过这一点，很好解决了饿汉式类加载时就实例化 instance 浪费内存的缺点
 */
public class Singleton {
    private Singleton(){}
    
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
