package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
    Write a program that computes the tax and tip on a restaurant bill.
    The program should ask the user to enter the charge for the meal.
    The tax should be 6.75 percent of the meal charge.
    The tip should be 20 percent of the total after adding the tax.
    Display the meal charge, tax amount, tip amount, and total bill on the screen.

    Result :
    Meal charge : 3000 Rs
    Tax : 6.75%
    Meal charge with tax : 3000 + (3000 * 0.0675) : 3202.50 Rs
    Tip : 20%
    Tip amount : 3202.50 * 0.2 : 640.50 Rs
    Final meal charge with tax and tip : 3202.50 + 640.50 : 3843.00 Rs
 */
public class RestaurantBill {

    public static final BigDecimal TAX_IN_PERCENTAGE = new BigDecimal("6.75");
    public static final BigDecimal TIP_IN_PERCENTAGE = new BigDecimal("20");
    public static final String PERCENTAGE_SIGN = "%";

    public static List<String> summary(BigDecimal mealCharge){
        var summary = new ArrayList<String>();

        summary.add(String.format("Meal charge : %.2f Rs", mealCharge));
        summary.add(String.format("Tax : %s%s", TAX_IN_PERCENTAGE, PERCENTAGE_SIGN));

        BigDecimal taxInDecimal = TAX_IN_PERCENTAGE.divide(new BigDecimal("100"));
        BigDecimal taxAmountOnMeanCharge = mealCharge.multiply(taxInDecimal);
        BigDecimal mealChargeAmountWithTax = mealCharge.add(taxAmountOnMeanCharge);

        summary.add(String.format("Meal charge with tax : %.2f Rs", mealChargeAmountWithTax));
        summary.add(String.format("Tip : %s%s", TIP_IN_PERCENTAGE, PERCENTAGE_SIGN));

        BigDecimal tipInDecimal = TIP_IN_PERCENTAGE.divide(new BigDecimal("100"));
        BigDecimal tipAmountOnTaxedMealCharge = mealChargeAmountWithTax.multiply(tipInDecimal);
        summary.add(String.format("Tip amount : %.2f Rs", tipAmountOnTaxedMealCharge));

        BigDecimal finalMealChargeWithTaxAndTip = mealChargeAmountWithTax.add(tipAmountOnTaxedMealCharge);

        summary.add(String.format("Final meal charge with tax and tip : %.2f Rs", finalMealChargeWithTaxAndTip));

        return summary;
    }

    public static void main(String[] args) {
        double num = 2 / 3;
        System.out.println("num = " + num);
    }

}
