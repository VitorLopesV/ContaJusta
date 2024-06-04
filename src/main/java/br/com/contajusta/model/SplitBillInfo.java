package br.com.contajusta.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class SplitBillInfo {

    private static SplitBillInfo splitBillInfo;
    private String mode;
    private Double accountValue;
    private Integer quantityPeople;
    private Double paidValue;
    private LocalDate date;

    private SplitBillInfo(){
    }

    public static SplitBillInfo getInstance(){
        if(splitBillInfo==null){
            splitBillInfo = new SplitBillInfo();
        }
        return splitBillInfo;
    }

    public Double divide(Double accountValue, Integer quantityPeople){
       this.paidValue = accountValue/quantityPeople;
        return this.paidValue;
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
