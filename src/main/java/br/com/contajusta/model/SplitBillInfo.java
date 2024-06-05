package br.com.contajusta.model;

import java.time.LocalDate;

public class SplitBillInfo {

    /** Modo de divisão. */
    private String mode;

    /** Valor da conta. */
    private Double accountValue;

    /** Quantidade de pessoas. */
    private Integer quantityPeople;

    /** Valor a ser pago por cada pessoa. */
    private Double paidValue;

    /** Data. */
    private LocalDate date;

    /** Construtor. */
    public SplitBillInfo() {
    }

    /**
     * @param mode                {@link #mode}
     * @param accountValue        {@link #accountValue}
     * @param quantityPeople      {@link #quantityPeople}
     * @param paidValue           {@link #paidValue}
     * @param date                {@link #date}
     */
    public SplitBillInfo(String mode, double accountValue, int quantityPeople, double paidValue, LocalDate date) {
        this.mode = mode;
        this.accountValue = accountValue;
        this.quantityPeople = quantityPeople;
        this.paidValue = paidValue;
        this.date = date;
    }

    /** Divide a conta de forma justa. */
    public Double divide(Double accountValue, Integer quantityPeople) {
        this.paidValue = accountValue / quantityPeople;
        return this.paidValue;
    }

    /** @return {@link #mode} */
    public String getMode() {
        return mode;
    }

    /** @param mode {@link #mode} */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /** @return {@link #accountValue} */
    public Double getAccountValue() {
        return accountValue;
    }

    /** @param accountValue {@link #accountValue} */
    public void setAccountValue(Double accountValue) {
        this.accountValue = accountValue;
    }

    /** @return {@link #quantityPeople} */
    public Integer getQuantityPeople() {
        return quantityPeople;
    }

    /** @param quantityPeople {@link #quantityPeople} */
    public void setQuantityPeople(Integer quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    /** @return {@link #paidValue} */
    public Double getPaidValue() {
        return paidValue;
    }

    /** @param paidValue {@link #paidValue} */
    public void setPaidValue(Double paidValue) {
        this.paidValue = paidValue;
    }

    /** @return {@link #date} */
    public LocalDate getDate() {
        return date;
    }

    /** @param date {@link #date} */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
