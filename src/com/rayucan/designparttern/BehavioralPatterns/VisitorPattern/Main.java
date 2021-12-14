package com.rayucan.designparttern.BehavioralPatterns.VisitorPattern;

import java.io.File;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 23:27
 * 
 * 访问者模式
 * 
 * 核心思想是访问复杂的数据结构，在不改变数据结构的前提下，把访问操作抽象出来
 * 如果需要新增一组操作，只需要新增一个访问者
 * 这里演示的是 扫描某路径下的所有 .java 文件
 * 
 * 如果要扫描 .exe 文件，只需要添加一个 ExeFileVisitor 即可
 */
public class Main {
    public static void main(String[] args) {
        FileStructure fileStructure = new FileStructure(new File("D:\\"));
        fileStructure.handle(new JavaFileVisitor());
    }
}
