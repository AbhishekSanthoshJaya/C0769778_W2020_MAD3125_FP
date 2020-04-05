package com.aby.c0769778_finalproject_mad3125.model;

import java.time.LocalDate;
import java.util.Date;

public abstract class Bill {

    enum BillType {
        Mobile,
        Hydro,
        Internet,
    }
    private String billId;
    private LocalDate billDate;
    private BillType billType;
    private Double billTotal;

    public Bill(String billId, LocalDate billDate, BillType billType, Double billTotal)
        {
          this.billId = billId;
          this.billDate = billDate;
          this.billType = billType;
          this.billTotal = billTotal;
        }

    public Double billCalculate(){
        double dummyAmount = 0.0;
        return dummyAmount;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public Double getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(Double billTotal) {
        this.billTotal = billTotal;
    }
}