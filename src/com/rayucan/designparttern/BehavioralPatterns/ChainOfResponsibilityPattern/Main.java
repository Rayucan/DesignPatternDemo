package com.rayucan.designparttern.BehavioralPatterns.ChainOfResponsibilityPattern;

import java.math.BigDecimal;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:22
 * 
 * 责任链模式
 * 
 * 是把多个处理器组合在一起，依次处理请求
 * 经常用于拦截器、检查权限、请求预处理等
 */
public class Main {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        
        // Handler 的添加顺序很重要
        // 若乱序，则可能造成不符预期的结果
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CeoHandler());
        
        chain.process(new Request("Alex", new BigDecimal("123.45")));
        chain.process(new Request("Alex", new BigDecimal("114514")));
        chain.process(new Request("Bob", new BigDecimal("11451.4")));
    }
}
