package com.rayucan.designparttern.BehavioralPatterns.ChainOfResponsibilityPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 9:53
 */
public interface Handler {
    /**
     * 
     * @param request
     * @return TRUE 成功
     * FALSE 失败
     * NULL 转交给下一个 Handler
     */
    Boolean process(Request request);
}
