package com.rayucan.designparttern.StructuralPatterns.CompositePattern;

import java.util.List;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 14:23
 */
public class CommentNode implements Node{
    private String text;
    
    public CommentNode(String text){
        this.text = text;
    }
    
    @Override
    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Node> children() {
        return List.of();
    }

    @Override
    public String toXml() {
        return "<!-- " + text + " -->";
    }
}
