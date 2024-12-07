package com.amalvadkar.jia.challenges;

public class SumNaturalNumberKata {

    public static int sum(int target) {
        int sum = 0;
        for (int i = 1; i<= target; i++){
            sum = sum + i;
        }
        return sum;
    }

    /*
        i/p = 3
        1+2+3 = 6

        i/p = 5
        1+2+3+4+5
     */

}
