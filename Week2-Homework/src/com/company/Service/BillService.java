package com.company.Service;

import com.company.Entity.Bill;
import com.company.Entity.MemberAccount;
import com.company.Entity.Response;
import com.company.Exception.BillException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillService {

    // dateformat işlemi response'da date String olarak tanımlandığı için stringe çeviriyoruz.
    //işlemin başarılı olma durumunda tarih ve "0" başarılı işlem kodu döner
    public Response successProcess(){
        Date now = new Date();
        DateFormat dfNow = new SimpleDateFormat("yyyy/mm/dd");
        return new Response("0", dfNow.format(now));
    }

    public Response pay(Bill bill , MemberAccount member) throws BillException{
        //if balance not enough
        if(member.getBalance()< bill.getAmount()){
            throw new BillException("Insufficient Balance");
        }   // if  enough
        else{
            return successProcess();
        }
    }

    //cancel payment
    public Response cancelPay(){
        return successProcess();
    }

    //inquire bill
    public Response inquireBill(int billType, String memberCode){
        checkBillType(billType);

        return successProcess();
    }

    // +phone paramater
   public Response inquireBill(int billType, String phone, String memberCode){
        checkBillType(billType);
        return successProcess();
    }


    private void checkBillType(int billType){
        if(billType==1){
            System.out.println("Telephone bill");
        }else if(billType==2){
            System.out.println("Internet bill");
        }else{
            System.out.println("Water bill");
        }
    }


}
