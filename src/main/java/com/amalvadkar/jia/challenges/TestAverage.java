package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Write a program that asks the user to enter three test scores.
    The program should display each test score, as well as the average of the scores.
 */
public class TestAverage {

    public static List<String> result(BigDecimal... scores){
        BigDecimal scoreSum = Arrays.stream(scores)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal average = scoreSum.divide(BigDecimal.valueOf(scores.length),
                RoundingMode.HALF_UP);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            result.add(String.format("Score %d : %.2f", i+1, scores[i]));
        }
        result.add(String.format("Average : %.2f", average));
        return result;
    }


}
