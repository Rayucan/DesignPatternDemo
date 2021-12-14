package com.rayucan.designparttern.BehavioralPatterns.ChainOfResponsibilityPattern;

import java.math.BigDecimal;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 9:57
 * 
 * 处理 1000 元以下的报销
 */
public class ManagerHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        // 1000 元以上，则转交给下一个 Handler
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0){
            return null;
        }
        
        // 屏蔽人名为 Alex 的消息
        return !request.getName().equalsIgnoreCase("ALEX");
    }
}
