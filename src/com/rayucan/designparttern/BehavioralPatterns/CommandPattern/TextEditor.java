package com.rayucan.designparttern.BehavioralPatterns.CommandPattern;

import java.awt.datatransfer.Clipboard;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:34
 */
public class TextEditor {
    /**
     * 剪切板
     */
    private static String clipBoard = "";
    
    private StringBuilder stringBuilder = new StringBuilder();
    
    public void copy(){
        clipBoard = stringBuilder.toString();
    }
    
    public void paste(){
        System.out.println(clipBoard);
    }
    
    public void add(String str){
        stringBuilder.append(str);
    }
    
    public void delete(){
        if (stringBuilder.length() > 0){
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
    
    public String getClipBoardState(){
        return clipBoard;
    }
}
