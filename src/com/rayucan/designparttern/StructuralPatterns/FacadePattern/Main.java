package com.rayucan.designparttern.StructuralPatterns.FacadePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:49
 * 
 * 外观模式
 * 
 * 用户只需要与 Facade 中介打交道
 * 就可以完成一系列流程
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        Company company = facade.openCompany("下北泽公司");

        System.out.println(company.getBankAccount());
        System.out.println(company.getTaxCode());
    }
}
