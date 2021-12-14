package com.rayucan.designparttern.BehavioralPatterns.ChainOfResponsibilityPattern;

import java.math.BigDecimal;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:07
 * 
 * 处理 100000 元以下的报销
 */
public class DirectorHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        // 100000 元以上转交给下一个 Handler
        if (request.getAmount().compareTo(BigDecimal.valueOf(100000)) > 0){
            return null;
        }
        
        // 屏蔽人名为 Bob 的消息
        return !request.getName().equalsIgnoreCase("BOB");
    }
}
