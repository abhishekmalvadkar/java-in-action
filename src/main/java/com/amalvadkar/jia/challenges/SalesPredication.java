package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;

public class SalesPredication {

    /*
        The East Coast sales division of a company generates 62 percent of total sales.
        Based on that percentage, write a program that will predict how much the
        East Coast division will generate if the company has $4.6 million in sales this year.
        Hint: Use the value 0.62 to represent 62 percent.
     */

    public static BigDecimal run(BigDecimal totalSales , BigDecimal percentage) {
        return totalSales.multiply(percentage);
    }
}
