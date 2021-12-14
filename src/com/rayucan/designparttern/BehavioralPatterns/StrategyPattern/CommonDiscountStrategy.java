package com.rayucan.designparttern.BehavioralPatterns.StrategyPattern;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 22:40
 */
public class CommonDiscountStrategy implements DiscountStrategy{
    /**
     * 普通用户打 9 折
     * @param total
     * @return
     */
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        //BigDecimal.setScale(int newScale, int roundingMode)
        //newScale: 保留newScale位小数
        //roundingMode: 舍去规则
        return total.multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.DOWN); //直接舍去小数点2位后面小数
    }
}
