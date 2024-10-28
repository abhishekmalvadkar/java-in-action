package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;

public class Challenge_2 {

    /*
        Take salary and increment amount
        and return new salary
     */
    public static String run(BigDecimal salary , BigDecimal incrementAmount){
        return salary.add(incrementAmount).toString();
    }
}
