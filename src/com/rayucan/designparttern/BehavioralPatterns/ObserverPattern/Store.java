package com.rayucan.designparttern.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 20:42
 * 
 * 不直接引用 Admin 和 Customer，而是引用 ProductObserver 接口的原因是
 * 解耦被观察者和观察者
 */
public class Store {
    private List<ProductObserver> observers = new ArrayList<>();
    private Map<String, Product> products = new HashMap<>();
    
    public void addObserver(ProductObserver observer){
        this.observers.add(observer);
    }
    
    public void removeObserver(ProductObserver observer){
        this.observers.remove(observer);
    }
    
    public void addNewProduct(String name, double price){
        Product p = new Product(name, price);
        products.put(p.getName(), p);
        
        //注意，这里使用了 forEach，是有问题的
        //实际上需要改成异步通知
        //防止处理太慢影响后续通知
        observers.forEach(observer -> observer.onPublished(p));
    }
    
    public void setProductPrice(String name, double price){
        Product p = products.get(name);
        p.setPrice(price);
        
        //这个forEach同理
        observers.forEach(observer -> observer.onPriceChanged(p));
    }
}
