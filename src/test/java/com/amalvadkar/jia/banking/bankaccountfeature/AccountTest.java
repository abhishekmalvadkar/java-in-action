package com.amalvadkar.jia.banking.bankaccountfeature;

import com.amalvadkar.jia.banking.bankaccountfeature.enums.TransactionType;
import com.amalvadkar.jia.banking.bankaccountfeature.exceptions.CustomException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AccountTest {

    @Test
    void should_withdraw_money_from_account() {
        Account account = new Account(new BigDecimal("1000"));
        account.withdraw(new BigDecimal("500"));
        assertThat(account.balance()).isEqualTo(new BigDecimal("500"));

    }

    @Test
    void should_withdraw_money_from_account_if_balance_negative() {
        Account account = new Account(new BigDecimal("1500"));

        assertThatThrownBy(() -> {
            account.withdraw(new BigDecimal("2000"));
            ;
        }).isInstanceOf(CustomException.class).hasMessage("balance not suffecient");
        assertThat(account.balance()).isEqualTo(new BigDecimal("1500"));
    }

    @Test
    void should_withdraw_money_from_account_if_balance_zero() {
        Account account = new Account(new BigDecimal("0"));

        assertThatThrownBy(() -> {
            account.withdraw(new BigDecimal("2000"));
            ;
        }).isInstanceOf(CustomException.class).hasMessage("balance not suffecient");
        assertThat(account.balance()).isEqualTo(new BigDecimal("0"));
    }

    @Test
    void should_deposit_money_account() {
        Account account = new Account(new BigDecimal("500"));
        account.deposit(new BigDecimal("500"));
        assertThat(account.balance()).isEqualTo(new BigDecimal("1000"));
    }


    @Test
    void should_show_transaction_List() {
        Account account = new Account();
        account.deposit(new BigDecimal("100"));
        account.deposit(new BigDecimal("200"));
        account.deposit(new BigDecimal("300"));
        account.deposit(new BigDecimal("400"));
        account.withdraw(new BigDecimal("10"));
        assertThat(account.transactionList()).hasSize(5);
        assertThat(account.transactionList()).containsExactlyInAnyOrder(
                new Transaction(new BigDecimal("100"), TransactionType.DEPOSITE, LocalDate.now()),
                new Transaction(new BigDecimal("200"), TransactionType.DEPOSITE, LocalDate.now()),
                new Transaction(new BigDecimal("300"), TransactionType.DEPOSITE, LocalDate.now()),
                new Transaction(new BigDecimal("400"), TransactionType.DEPOSITE, LocalDate.now()),
                new Transaction(new BigDecimal("10"), TransactionType.WITHDRAW, LocalDate.now())

        );

    }

    @Test
    void should_print_last_3_transactions_and_current_balance() {
        // Given
        Account account = new Account();

        // When
        account.deposit(new BigDecimal("100"));
        account.deposit(new BigDecimal("200"));
        account.deposit(new BigDecimal("300"));
        account.deposit(new BigDecimal("400"));
        account.withdraw(new BigDecimal("100"));

        // Then
        assertThat(account.print()).isEqualTo("""
                Statements
                
                Deposit: 100
                Deposit: 200
                Deposit: 300
                Deposit: 400
                Withtdraw: 100
                
                Current Balance: 900""");


    }

    @Test
    void should_throw_exception_when_withdraw_limit_exceed_for_that_day() {
        Account account = new Account(new BigDecimal("500"));

        account.withdraw(new BigDecimal("10"));
        account.withdraw(new BigDecimal("10"));
        account.withdraw(new BigDecimal("10"));
        account.withdraw(new BigDecimal("10"));
        account.withdraw(new BigDecimal("10"));

        assertThatThrownBy(() -> account.withdraw(new BigDecimal("10")))
                .isInstanceOf(CustomException.class)
                .hasMessage("limit has been finished");
        assertThat(account.balance()).isEqualTo(new BigDecimal("450"));
    }


}