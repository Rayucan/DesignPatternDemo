package com.rayucan.designparttern.StructuralPatterns.FacadePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 21:42
 */
public class Company {
    private String id;
    private String name;
    private String bankAccount;
    private String taxCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
}
