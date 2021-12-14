package com.rayucan.designparttern.StructuralPatterns.FacadePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:49
 * 
 * 我们以注册公司为例，假设注册公司需要三步：
 *
 * 向工商局申请公司营业执照；
 * 在银行开设账户；
 * 在税务局开设纳税号。
 */
public class Facade {
    public static Admin admin = new Admin();
    public static Bank bank = new Bank();
    public static Tax tax = new Tax();
    
    public Company openCompany(String name){
        Company company = admin.register(name);
        String bankAccount = bank.openAccount(company.getId());
        company.setBankAccount(bankAccount);
        String taxCode = tax.applyTaxCode(company.getId());
        company.setTaxCode(taxCode);
        return company;
    }
}
