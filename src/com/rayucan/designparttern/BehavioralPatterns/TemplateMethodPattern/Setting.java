package com.rayucan.designparttern.BehavioralPatterns.TemplateMethodPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 23:12
 * 
 * 模板方法模式
 * 
 * 将某些方法的实现延迟到子类去实现
 * 比如暂时想不出某些方法如何编写，就可以使用该策略
 * 
 * 类声明为抽象类，方法声明为抽象方法即可
 * 
 * 总结：父类定义骨架，子类实现细节
 */
public abstract class Setting {
    public final String getSetting(String key){
        //先从缓存读取
        String value = lookUpCache(key);
        if (value == null){
            value = readFromDB(key);
            putIntoCache(key, value);
        }
        return value;
    }
    
    protected abstract String readFromDB(String key);
    
    protected abstract String lookUpCache(String key);
    
    protected abstract void putIntoCache(String key, String value);
}
