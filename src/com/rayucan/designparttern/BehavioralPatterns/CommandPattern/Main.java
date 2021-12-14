package com.rayucan.designparttern.BehavioralPatterns.CommandPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:41
 * 
 * 命令模式
 * 
 * 模拟一个文档编辑器
 * 
 * 封装一些接口，在此基础上添加额外功能
 * 如 redo,undo
 */
public class Main {
    public static void main(String[] args) {
        //一般调用
        TextEditor textEditor = new TextEditor();
        textEditor.add("this is a test");
        textEditor.copy();
        textEditor.paste();
        
        //Command模式调用
        TextEditor commandTextEditor = new TextEditor();
        commandTextEditor.add("this is a command test");
        CopyCommand copyCommand = new CopyCommand(commandTextEditor);
        copyCommand.execute();
        PasteCommand pasteCommand = new PasteCommand(commandTextEditor);
        pasteCommand.execute();
    }
}
