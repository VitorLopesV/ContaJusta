package br.com.contajusta.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class SplitBillInfoAux {

        SplitBillInfo splitBillInfo = SplitBillInfo.getInstance();

        private String mode;
        private Double accountValue;
        private Integer quantityPeople;
        private Double paidValue;
        private LocalDate date;
        private ArrayList<SplitBillInfoAux> splitBillInfoAux;

        public SplitBillInfoAux(String mode, double accountValue, int quantityPeople, double paidValue, LocalDate date){
            this.mode = mode;
            this.accountValue = accountValue;
            this.quantityPeople = quantityPeople;
            this.paidValue = paidValue;
            this.date = date;
        }

        public String getMode(){
            return this.mode;
        }

        public Double getAccountValue(){
            return this.accountValue;
        }

        public Integer getQuantityPeople(){
            return this.quantityPeople;
        }

        public Double getPaidValue(){
            return this.paidValue;
        }

        public LocalDate getDate(){
            return this.date;
        }
    }
