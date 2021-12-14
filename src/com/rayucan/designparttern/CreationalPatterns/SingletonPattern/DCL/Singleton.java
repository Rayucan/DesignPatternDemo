package com.rayucan.designparttern.CreationalPatterns.SingletonPattern.DCL;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 21:39
 * 
 * 双重校验锁 Double-Checked Locking
 * 
 * 这种方式为懒加载，且能在多线程情况下保证较高的性能
 */
public class Singleton {
    
    //方便下文分析 volatile
    int t1 = 0;
    int t2 = 0;
    
    private Singleton(){
        t1 = 1;
        t2 = 2;
    }

    /**
     * 关于 instance 为什么加 volatile:
     * https://blog.csdn.net/qiyei2009/article/details/71813069
     * 
     * 简单来说，就是不加的情况下，线程 A 持有锁，进行初始化，但其初始化是分多步进行的（即多条指令），很有可能乱序执行
     * 例如，线程 A 初始化执行到 t1 = 1，t2 还没来得及赋值
     * 此时，线程 B 看到的 instance 已经不是 null 了
     * 然后，线程 B 获取的对象 t2 为 0 而不是 2，造成数据丢失
     * 
     * 加上 volatile，一是保证写操作在读操作之前完成，二是防止指令重排序
     */
    private volatile static Singleton instance;
    
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
