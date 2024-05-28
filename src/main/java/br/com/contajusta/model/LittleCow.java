package br.com.contajusta.model;

import javax.xml.crypto.Data;

public class LittleCow {

    private String mode;
    private Double accountValue;
    private Integer quantityPeople;
    private Double paidValue;
    private Data data;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
