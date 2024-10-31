package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
    Write a program that will ask the user to enter the amount of a purchase.
    The program should then compute the state and county sales tax.
    Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
    The program should display the amount of the purchase, the state sales tax,
    the county sales tax, the total sales tax, and the total of the sale
    (which is the sum of the amount of purchase plus the total sales tax).

    Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.

    Purchase amount = 150 Rs
    Sales tax = 0.04 (4%)
    Country sales tax = 0.02(2%)
    Total sales tax = 0.06(6%)
    Total amount = Purchase amount + (Purchase amount * 0.06)
 */
public class SalesTax {

    public static final BigDecimal STATE_SALES_TAX = new BigDecimal("0.04");
    public static final BigDecimal COUNTRY_SALES_TAX = new BigDecimal("0.02");

    public static List<String> preparePurchaseSummaryMessages(BigDecimal purchaseAmount){
        List<String> summaryMessages = new ArrayList<>();

        summaryMessages.add(String.format("Purchase amount : %.2f Rs", purchaseAmount));

        BigDecimal stateSalesTaxPer = STATE_SALES_TAX.multiply(new BigDecimal("100"));
        summaryMessages.add(String.format("State sales tax = %s%%", stateSalesTaxPer.intValue()));

        BigDecimal countrySalesTasPer = COUNTRY_SALES_TAX.multiply(new BigDecimal("100"));
        summaryMessages.add(String.format("Country sales tax = %s%%", countrySalesTasPer.intValue()));

        BigDecimal totalSalesTaxPer = stateSalesTaxPer.add(countrySalesTasPer);
        summaryMessages.add(String.format("Total sales tax = %s%%", totalSalesTaxPer.intValue()));

        BigDecimal totalSalesTax = STATE_SALES_TAX.add(COUNTRY_SALES_TAX);

        BigDecimal finalAmount = purchaseAmount.add(purchaseAmount.multiply(totalSalesTax));

        summaryMessages.add(String.format("Total amount = %.2f Rs", finalAmount));

        return summaryMessages;
    }

}
