package com.rayucan.designparttern.BehavioralPatterns.StrategyPattern;

import java.math.BigDecimal;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 22:49
 */
public class OverDiscountStrategy implements DiscountStrategy{
    /**
     * 满减策略
     * 满100减20
     * @param total
     * @return
     */
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        return total.compareTo(BigDecimal.valueOf(100)) >= 0 ? BigDecimal.valueOf(20) : BigDecimal.ZERO;
    }
}
