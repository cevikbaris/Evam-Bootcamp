package com.company.Exception;

//custom exception class
public class BillException extends Throwable {

    private String message;

    public BillException(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

}
