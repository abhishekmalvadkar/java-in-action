package com.amalvadkar.jia.banking.bankaccountfeature;

import com.amalvadkar.jia.banking.bankaccountfeature.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Transaction(BigDecimal transactionAmount, TransactionType transactionType, LocalDate transactionDate) {

    public boolean isWithdrawTransactions() {
        return TransactionType.WITHDRAW == transactionType;
    }

    public boolean isTodayTransactions() {
        return LocalDate.now().isEqual(transactionDate);
    }
}
