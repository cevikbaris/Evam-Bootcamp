package com.company.Service;

import com.company.Entity.MemberAccount;

public class MemberAccountService {

    //create and print member
    public MemberAccount create(String name, String surname, float balance, String phoneNumber){
        return new MemberAccount(name,surname,balance,phoneNumber);
    }


    public void update(MemberAccount oldMember, MemberAccount newMember){
        System.out.println("Member is updated");
    }

    public void delete(MemberAccount member){
        System.out.println("Member has been deleted");
    }

    public void read(MemberAccount member){
        System.out.println(member.toString());
    }
}
