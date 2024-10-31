package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
        One acre of land is equivalent to 43,560 square feet.
        Write a program that calculates the number of acres in a tract of land with 389,767 square feet.
        Hint: Divide the size of the tract of land by the size of an acre to get the number of acres.

        43,560 square feet -> 1 acre
        389,767 square feet -> ?
*/
public class LandCalculation {
    public static final BigDecimal ONE_ACRE_SQUARE_FEET = new BigDecimal("43560");

    public static BigDecimal calculateAcre(BigDecimal inputSquareFeet) {
        int scale = 2;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return inputSquareFeet.divide(ONE_ACRE_SQUARE_FEET, scale, roundingMode);
    }
}

/*
    Learning points

    Division Without Rounding Mode: When you divide two BigDecimal values, if the result is a repeating decimal (like dividing 1 by 3),
    Java throws java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result
    because it can't represent the result exactly.

    This is most commonly seen when using BigDecimal for division without specifying a rounding mode.

    RoundingMode.HALF_UP:

    Rounds to the nearest neighbor. If the digit after the second decimal place is 5 or higher, it rounds up.

    Example: 2.345 becomes 2.35, and 2.344 becomes 2.34

 */


