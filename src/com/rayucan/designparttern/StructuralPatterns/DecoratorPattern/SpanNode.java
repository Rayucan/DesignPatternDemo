package com.rayucan.designparttern.StructuralPatterns.DecoratorPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 14:47
 */
public class SpanNode implements TextNode{
    private String text;
    
    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
