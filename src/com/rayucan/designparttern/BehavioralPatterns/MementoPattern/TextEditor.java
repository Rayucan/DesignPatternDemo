package com.rayucan.designparttern.BehavioralPatterns.MementoPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 20:13
 * 
 * 备忘录模式
 * 
 * 保存对象的内部状态，以便将来用于回复
 * 大多数应用的保存、打开都属于备忘录模式
 */
public class TextEditor {
    private StringBuilder buffer = new StringBuilder();
    
    public void add(char ch){
        buffer.append(ch);
    }
    
    public void add(String s){
        buffer.append(s);
    }
    
    public void delete(){
        if (buffer.length() > 0){
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }
    
    public String getState(){
        return buffer.toString();
    }
    
    public void setState(String state){
        this.buffer.delete(0, this.buffer.length());
        this.buffer.append(state);
    }
}
