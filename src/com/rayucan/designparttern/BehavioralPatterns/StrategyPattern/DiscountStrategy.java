package com.rayucan.designparttern.BehavioralPatterns.StrategyPattern;

import java.math.BigDecimal;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 22:39
 */
public interface DiscountStrategy {
    BigDecimal getDiscount(BigDecimal total);
}
