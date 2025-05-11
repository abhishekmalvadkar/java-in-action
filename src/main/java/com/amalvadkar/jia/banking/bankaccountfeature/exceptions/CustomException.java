package com.amalvadkar.jia.banking.bankaccountfeature.exceptions;

public class CustomException extends RuntimeException {


    private int statusCode;

    public CustomException(String errorMessage, int statusCode){
        super(errorMessage);
        statusCode = statusCode;
    }

    public CustomException(String mesage){
        super(mesage);
    }
}
