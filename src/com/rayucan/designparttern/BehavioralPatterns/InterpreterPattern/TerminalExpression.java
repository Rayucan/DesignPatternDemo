package com.rayucan.designparttern.BehavioralPatterns.InterpreterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 17:14
 */
public class TerminalExpression implements Expression{
    
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        
        return false;
    }
}
