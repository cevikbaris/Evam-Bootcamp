package com.company.Entity;

import com.company.Entity.Bill;

public class MemberAccount {

    private String name;
    private String surname;
    private String memberCode;
    private int id;
    private float balance; //float or BigInt BigDecimal
    private String phoneNumber;
    private Bill bill;  // bu kişinin faturası. Sorgulamak için.

    //constructor method for implement paramaters to member account
    public MemberAccount(String name, String surname, float balance, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }
    // getters setters
    MemberAccount(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMemberCode() {
         return name.substring(0,2)+getId();
    }

    public void setCode(String code) {
        this.memberCode = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Bill getBill() {return bill;}

    public void setBill(Bill bill) {this.bill = bill;}
    @Override
    public String toString() {
        return "MemberAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", memberCode='" + memberCode + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
