package com.amalvadkar.jia.banking.bankaccountfeature.enums;

public enum TransactionType {

    WITHDRAW("Withtdraw"),

    DEPOSITE("Deposit");

    public String getValue() {
        return value;
    }

    private String value;

    TransactionType( String value){
        this.value = value;
    }
}
