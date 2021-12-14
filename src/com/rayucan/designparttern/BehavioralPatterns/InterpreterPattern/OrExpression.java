package com.rayucan.designparttern.BehavioralPatterns.InterpreterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 17:17
 */
public class OrExpression implements Expression{
    private Expression exp1 = null;
    private Expression exp2 = null;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
