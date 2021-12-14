package com.rayucan.designparttern.BehavioralPatterns.InterpreterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 17:13
 */
public interface Expression {
    public boolean interpret(String context);
}
