package com.rayucan.designparttern.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 14:15
 */
public class ElementNode implements Node{
    private String name;
    private List<Node> list = new ArrayList<>();
    
    public ElementNode(String name){
        this.name = name;
    }
    
    @Override
    public Node add(Node node) {
        list.add(node);
        return this;
    }

    @Override
    public List<Node> children() {
        return list;
    }

    @Override
    public String toXml() {
        String start = "<" + name + ">" + "\n";
        String end = "</" + name + ">";

        StringJoiner stringJoiner = new StringJoiner("", start, end);
        
        list.forEach(node -> {
            stringJoiner.add(node.toXml() + "\n");
        });
        
        return stringJoiner.toString();
    }
}
