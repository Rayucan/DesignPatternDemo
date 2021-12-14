package com.rayucan.designparttern.BehavioralPatterns.ChainOfResponsibilityPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:14
 * 
 * 处理任意金额的报销
 */
public class CeoHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        return true;
    }
}
