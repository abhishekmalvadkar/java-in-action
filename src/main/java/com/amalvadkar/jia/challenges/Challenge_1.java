package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;

public class Challenge_1 {

    /*
        1. Name, age, and annual income

        Write a program that declares the following:
            •  a String variable named name
            •  an int variable named age
            •  a double variable named annualPay
        Store your age, name, and desired annual income as literals in these variables. The program should display these values on the screen in a manner
        similar to the following:

        My name is Joe Mahoney, my age is 26 and
        I hope to earn $100000.0 per year.
     */

    public static String run(String name, int age, BigDecimal annualPay){
        return String.format("""
                My name is %s, my age is %d and
                I hope to earn $%.2f per year.
                """, name, age, annualPay);
    }

    /*
        Learning points
        1) Use BigDecimal(constructor one only) for amount related things otherwise
           you will not get exact values everytime if you use
           float or double then you will get approximate values,
           float and double made for engineering and scientific
           calculations where exact values no matter.
        2) The issue I was facing formatting the BigDecimal when using String.format.
            The default behavior for %f is to display six decimal places,
            which is why I got 100000.000000 instead of 100000.00.
            To format BigDecimal correctly and control the number of decimal places,
            I use the %.2f format specifier if you want just two decimal place.
        3) That using %.2f can lead to rounding up as I have take 2 because in monetary
           amount generally we take 2 decimal points
        4) Feel free to add aggressive test to check this solution
        5) If you want as it is where don't care about round up then use
            %s for BigDecimnal and use annualPay.toString()
     */



}
