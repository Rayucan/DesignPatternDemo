package com.rayucan.designparttern.CreationalPatterns.SingletonPattern.Enum;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:16
 * 
 * 枚举式
 * 
 * 简洁高效，但使用较少
 * 涉及到反序列化时可以考虑使用
 */
public enum Singleton {
    INSTANCE;
    
    public void doSome(){
        //...
    }
}
