package com.rayucan.designparttern.StructuralPatterns.FacadePattern;

import java.util.Random;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:47
 */
public class Bank {
    public String openAccount(String companyId){
        System.out.println("Bank::openAccount method");
        return String.valueOf(new Random().nextInt());
    }
}
