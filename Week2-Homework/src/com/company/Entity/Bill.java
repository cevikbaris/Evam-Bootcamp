package com.company.Entity;

import java.lang.reflect.Member;
import java.util.Date;

//bill = fatura
public class Bill {

    private int amount;

    private Date process_date;

    private int billType;

    public Bill(int amount, Date process_date, int billType) {
        this.amount = amount;
        this.process_date = process_date;
        this.billType = billType;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                ", process_date=" + process_date +
                ", billType=" + billType +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getProcess_date() {
        return process_date;
    }

    public void setProcess_date(Date process_date) {
        this.process_date = process_date;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }

}
