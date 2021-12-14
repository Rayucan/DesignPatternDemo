package com.rayucan.designparttern.StructuralPatterns.DecoratorPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 14:48
 */
public abstract class NodeDecorator implements TextNode{
    protected final TextNode target;

    protected NodeDecorator(TextNode target) {
        this.target = target;
    }

    public void setText(String text){
        this.target.setText(text);
    }
}
