package com.rayucan.designparttern.StructuralPatterns.CompositePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 14:24
 */
public class Main {
    public static void main(String[] args) {
        Node root = new ElementNode("114514Node");
        
        root.add(new ElementNode("classA"))
                .add(new TextNode("Van"))
                .add(new TextNode("DarkHome"));
        
        root.add(new ElementNode("classB"))
                .add(new TextNode("Bill"))
                .add(new TextNode("Gates"))
                .add(new CommentNode("this is a comment"));

        System.out.println(root.toXml());
    }
}
