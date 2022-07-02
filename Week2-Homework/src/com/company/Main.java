package com.company;

import com.company.Entity.Bill;
import com.company.Entity.MemberAccount;
import com.company.Entity.Response;
import com.company.Exception.BillException;
import com.company.Service.BillService;
import com.company.Service.Client;
import com.company.Service.MemberAccountService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    // a client instance is created.
    private static Client client;



    // a static method . Check the Member can pay bill or not.
    //
    public static void payment(Bill bill, MemberAccount member){
        client=new Client();
        try{
            Response paymentOfJohn =  client.pay( bill, member);
            System.out.println("Payment is success. Date : "+paymentOfJohn.getDate());

        }catch (BillException ex){ // CUSTOM EXCEPTION  BillService throws it.
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) throws BillException {

        client=new Client();

        Date date = new Date();
        MemberAccountService memberAccountService = new MemberAccountService(); // CRUD process

        // the member is created with service
        MemberAccount baris = memberAccountService.create("Barış","Çevik",5000,"05398307911");

        // this member's balance not enough to pay the bill.
        MemberAccount john = memberAccountService.create("John","Smith",10,"053983532153");

        //print member
        memberAccountService.read(baris);
        memberAccountService.read(john);

        // bill is created. We will pay it.
        Bill billTelephone = new Bill(1000, date  ,1);
        Bill billWater = new Bill(100, date  ,3);


        // each user has same bill now. But john will not be able to pay.
        baris.setBill(billTelephone);
        john.setBill(billWater);

        System.out.println("------------------------------------------------------------");
        //inquire bills
        //telephone
        Response telephoneBillResponse = client.inquireBill(baris.getBill().getBillType(), baris.getPhoneNumber(), baris.getMemberCode());
        //water
        Response waterBillResponse =  client.inquireBill(john.getBill().getBillType(), john.getMemberCode());

        // Is inquire process success or failed. 0 success 1 fail
        if(telephoneBillResponse.getCode().equals("0"))
            System.out.println("Telephone bill inquire is success. Date : "+telephoneBillResponse.getDate());
        if(waterBillResponse.getCode().equals("0"))
            System.out.println("Water bill inquire is success. Date : "+waterBillResponse.getDate());


        System.out.println("------------------------------------------------------------");
        // try pay the bill. Baris is user. It's money is enough.
        payment(baris.getBill() , baris);
        // try pay the bill. John is user. Money not enough. Catch the exception that i created
        payment(john.getBill() , john);

    }

}
