package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
   An electronics company sells circuit boards at a 40 percent profit.
   If you know the retail price of a circuit board, you can calculate its profit with the
   following formula: Profit = Retail price × 0.4
   Write a program that asks the user for the retail price of a circuit board,
   calculates the amount of profit earned for that product,
   and displays the results on the screen.

   Ex :
   Retail price = 400
   profit % = 40 %
   Earned profit amount = 40 * 0.4 = 160
 */
public class CircuitBoardProfit {

    public static final BigDecimal PROFIT_PERCENTAGE = new BigDecimal("0.4");

    public static BigDecimal calculateProfitAmount(BigDecimal retailPrice){
        return retailPrice.multiply(PROFIT_PERCENTAGE)
                .setScale(2, RoundingMode.HALF_UP);
    }

}

/*
    Learning point :

    -> scale and RoundingMode is life saviour :)
    -> When someone tell you some % like 40 % then take 0.4 in your calculation same
       60 % then take 0.6 in your calculation

 */
