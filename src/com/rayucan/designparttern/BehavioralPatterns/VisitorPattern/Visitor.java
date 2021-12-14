package com.rayucan.designparttern.BehavioralPatterns.VisitorPattern;

import java.io.File;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 23:21
 */
public interface Visitor {
    /**
     * 访问文件夹
     * @param dir
     */
    void visitDir(File dir);

    /**
     * 访问文件
     * @param file
     */
    void visitFile(File file);
}
