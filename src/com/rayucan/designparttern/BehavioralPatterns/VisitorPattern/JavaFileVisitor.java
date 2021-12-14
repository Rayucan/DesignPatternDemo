package com.rayucan.designparttern.BehavioralPatterns.VisitorPattern;

import java.io.File;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 23:25
 */
public class JavaFileVisitor implements Visitor{
    @Override
    public void visitDir(File dir) {
        System.out.println("Visit dir:" + dir);
    }

    @Override
    public void visitFile(File file) {
        if (file.getName().endsWith(".java")){
            System.out.println("Java File Found:" + file);
        }
    }
}
