package com.aby.c0769778_finalproject_mad3125.abhishek.model;


import org.joda.time.LocalDate;

public class Internet extends Bill {
    private String providerName;
    private Double gbUsed;

    public Internet(String billId, LocalDate billDate, BillType billType, String providerName, Double gbUsed)
    {
        super(billId, billDate, billType);
        this.providerName = providerName;
        this.gbUsed = gbUsed;
        this.billTotal = billCalculate();
    }

    @Override
    public Double billCalculate(){
        double billAmount = 0.0;
        if( gbUsed < 10){
            billAmount = 3 * gbUsed;
        }
        else {
            billAmount = 3.5 * gbUsed;
        }
        return billAmount;
    }

    public String getProviderName() {
        return providerName;
    }

    public Double getGbUsed() {
        return gbUsed;
    }
}

