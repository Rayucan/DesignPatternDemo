package com.rayucan.designparttern.BehavioralPatterns.StrategyPattern;

import java.math.BigDecimal;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 22:58
 * 
 * 应用策略
 */
public class DiscountContext {
    /**
     * 默认策略，即普通用户 9 折
     */
    private DiscountStrategy strategy = new CommonDiscountStrategy();

    /**
     * 允许用户自定义策略
     * 如满减策略、VIP 策略
     * @param strategy
     */
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
    
    public BigDecimal calculatePrice(BigDecimal total){
        return total.subtract(this.strategy.getDiscount(total).setScale(2));
    }
}
