package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;

public class SalaryIncrement {

    /*
        Take salary and increment amount
        and return new salary
     */
    public static BigDecimal run(BigDecimal salary , BigDecimal incrementAmount){
        return salary.add(incrementAmount);
    }

    /*
        Learning points
        1) If you use float ot double for salary and incrementAmount then your test will fail
        2) BigDecimal input and String as return type
        3) BigDecimal input and BigDecimal as return type
     */
}
