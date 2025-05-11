package com.amalvadkar.jia.banking.bankaccountfeature;

import com.amalvadkar.jia.banking.bankaccountfeature.enums.TransactionType;
import com.amalvadkar.jia.banking.bankaccountfeature.exceptions.CustomException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {


    private BigDecimal currentBalance;
    private List<Transaction> transactionList = new ArrayList();


    public Account(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Account() {
        currentBalance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal bigDecimal) {
        currentBalance = currentBalance.add(bigDecimal);
        transactionList.add(new Transaction(bigDecimal, TransactionType.DEPOSITE, LocalDate.now()));
    }

    public BigDecimal balance() {
        return currentBalance;
    }

    public List<Transaction> transactionList() {
        return transactionList;
    }

    public void withdraw(BigDecimal amount) {
        checkWithdrawLimit();
        checkCurruntBalance(amount);
        currentBalance = currentBalance.subtract(amount);
        transactionList.add(new Transaction(amount, TransactionType.WITHDRAW, LocalDate.now()));
    }

    private void checkWithdrawLimit() {
        long todayWithdrawTransactionsCount = findTodayWithdrawTransactionCount();
        if (todayWithdrawTransactionsCount >= 5) {
            throw new CustomException("limit has been finished");
        }
    }

    private long findTodayWithdrawTransactionCount() {
        return transactionList.stream()
                .filter(Transaction::isTodayTransactions)
                .filter(Transaction::isWithdrawTransactions)
                .count();
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder("Statements\n\n");
        for (Transaction transaction : transactionList) {
            stringBuilder.append(transaction.transactionType().getValue() + ":" + " " + transaction.transactionAmount() + "\n");

        }
        return stringBuilder.append("\n").append("Current Balance:").append(" ").append(currentBalance).toString();
    }

    private void checkCurruntBalance(BigDecimal amount) {
        if (inSufficientBalance(amount)) {
            throw new CustomException("balance not suffecient", 404);
        }
    }

    private boolean inSufficientBalance(BigDecimal amount) {
        return amount.compareTo(currentBalance) > 0;
    }


}
