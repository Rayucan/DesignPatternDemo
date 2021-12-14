package com.rayucan.designparttern.StructuralPatterns.DecoratorPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:37
 */
public class Main {
    public static void main(String[] args) {
        TextNode n1 = new SpanNode();
        TextNode n2 = new BoldDecorator(new SpanNode());
        
        n1.setText("114514");
        n2.setText("hhhh");

        System.out.println(n1.getText());
        System.out.println(n2.getText());
    }
}
