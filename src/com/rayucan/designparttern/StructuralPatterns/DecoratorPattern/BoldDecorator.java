package com.rayucan.designparttern.StructuralPatterns.DecoratorPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:35
 */
public class BoldDecorator extends NodeDecorator{
    public BoldDecorator(TextNode target){
        super(target);
    }
    
    @Override
    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}
