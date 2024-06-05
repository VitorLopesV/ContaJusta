package br.com.contajusta.model;

import br.com.contajusta.RegisterManager;

import java.time.LocalDate;

public class SplitBillInfo {

    RegisterManager registerManager = RegisterManager.getInstance();

    private String mode;

    private Double accountValue;

    private Integer quantityPeople;

    private Double paidValue;

    private LocalDate date;

    public SplitBillInfo(){
    }

    public SplitBillInfo(String mode, double accountValue, int quantityPeople, double paidValue, LocalDate date) {
        this.mode = mode;
        this.accountValue = accountValue;
        this.quantityPeople = quantityPeople;
        this.paidValue = paidValue;
        this.date = date;
    }

    public Double divide(Double accountValue, Integer quantityPeople){
        this.paidValue = accountValue/quantityPeople;
        return this.paidValue;
    }

    public RegisterManager getRegisterManager() {
        return registerManager;
    }

    public void setRegisterManager(RegisterManager registerManager) {
        this.registerManager = registerManager;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Double getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(Double accountValue) {
        this.accountValue = accountValue;
    }

    public Integer getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(Integer quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    public Double getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(Double paidValue) {
        this.paidValue = paidValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
