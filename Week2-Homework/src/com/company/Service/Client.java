package com.company.Service;

import com.company.Entity.Response;
import com.company.Service.BillService;

import java.util.Scanner;

public class Client extends BillService {  // bill service extends edildi içindeki methodlar kullanılabilir

    // super ile bill service'de tanımlanan 2 farklı overload edilmiş methodlara yönlendirdik

    @Override
    public Response inquireBill(int billType, String memberCode) {
        return super.inquireBill(billType, memberCode);
    }

    @Override
    public Response inquireBill(int billType, String phone, String memberCode) {
        return super.inquireBill(billType, phone, memberCode);
    }
}
