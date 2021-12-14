package com.rayucan.designparttern.BehavioralPatterns.InterpreterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 17:18
 * 
 * 解释器模式
 * 
 * 多用于正则表达式解析、SQL语句解析
 */
public class Main {
    public static void main(String[] args) {
        Expression exp1 = getMaleExpression();
        Expression exp2 = getMarriedWomanExpression();

        System.out.println(exp1.interpret("Alex"));
        System.out.println(exp1.interpret("Bili"));
        System.out.println(exp1.interpret("114514"));

        System.out.println("===========");
        System.out.println(exp2.interpret("Julie"));
        System.out.println(exp2.interpret("Julie Married"));
    }
    
    public static Expression getMaleExpression(){
        Expression exp1 = new TerminalExpression("Van");
        Expression exp2 = new TerminalExpression("Bili");
        return new OrExpression(exp1, exp2);
    }
    
    public static Expression getMarriedWomanExpression(){
        Expression exp = new TerminalExpression("Julie");
        Expression isMarried = new TerminalExpression("Married");
        return new AndExpression(exp, isMarried);
    }
}
