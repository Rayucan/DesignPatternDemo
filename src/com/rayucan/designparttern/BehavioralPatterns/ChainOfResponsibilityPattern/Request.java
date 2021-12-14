package com.rayucan.designparttern.BehavioralPatterns.ChainOfResponsibilityPattern;

import java.math.BigDecimal;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 9:52
 */
public class Request {
    private String name;
    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
