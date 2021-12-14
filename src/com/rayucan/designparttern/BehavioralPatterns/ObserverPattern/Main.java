package com.rayucan.designparttern.BehavioralPatterns.ObserverPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/10 16:16
 * 
 * 观察者模式
 * 
 * 又称为发布-订阅模式，当一个对象的状态发生改变，另一些对象集合希望得到此通知
 * 
 * 注意：发送通知的是 "被观察者"，接收通知的是 "观察者"
 */
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Customer customer = new Customer();
        
        Store store = new Store();
        
        //注册Observer
        store.addObserver(admin);
        store.addObserver(customer);
    }
}
