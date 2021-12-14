package com.rayucan.designparttern.CreationalPatterns.SingletonPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 16:34
 */
public class Main {
    public static void main(String[] args) {
        //不可以直接 new SingleObject()
        //因为构造函数私有

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.sayHello();
    }
}
