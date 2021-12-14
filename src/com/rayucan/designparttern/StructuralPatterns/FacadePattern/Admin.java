package com.rayucan.designparttern.StructuralPatterns.FacadePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:41
 */
public class Admin {
    public Company register(String name){
        Company company = new Company();
        company.setName(name);
        return company;
    }
}
