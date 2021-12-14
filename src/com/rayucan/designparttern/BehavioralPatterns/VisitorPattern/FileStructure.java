package com.rayucan.designparttern.BehavioralPatterns.VisitorPattern;

import java.io.File;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 23:22
 */
public class FileStructure {
    //根目录
    private File path;
    
    public FileStructure(File path){
        this.path = path;
    }
    
    public void handle(Visitor visitor){
        scan(this.path, visitor);
    }
    
    private void scan(File file, Visitor visitor){
        if (file.isDirectory()){
            visitor.visitDir(file);
            //递归子文件夹
            for (File sub : file.listFiles()) {
                scan(sub, visitor);
            }
        }else if (file.isFile()){
            visitor.visitFile(file);
        }
    }
}
