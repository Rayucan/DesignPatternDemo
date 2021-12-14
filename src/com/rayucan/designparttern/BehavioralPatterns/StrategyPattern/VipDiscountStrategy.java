package com.rayucan.designparttern.BehavioralPatterns.StrategyPattern;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 22:51
 */
public class VipDiscountStrategy implements DiscountStrategy{
    /**
     * VIP 用户打 7 折
     * @param total
     * @return
     */
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        return total.multiply(new BigDecimal("0.3")).setScale(2, RoundingMode.DOWN);
    }
}
