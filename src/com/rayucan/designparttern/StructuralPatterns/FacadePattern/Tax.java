package com.rayucan.designparttern.StructuralPatterns.FacadePattern;

import java.util.UUID;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:48
 */
public class Tax {
    public String applyTaxCode(String companyId){
        System.out.println("Tax::applyTaxCode method");
        return UUID.randomUUID().toString();
    }
}
