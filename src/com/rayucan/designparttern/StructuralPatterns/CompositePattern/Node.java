package com.rayucan.designparttern.StructuralPatterns.CompositePattern;

import java.util.List;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 14:10
 */
public interface Node {
    Node add(Node node);
    List<Node> children();
    String toXml();
}
