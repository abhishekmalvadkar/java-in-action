package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    Write a program that asks the user to enter three test scores.
    The program should display each test score, as well as the average of the scores.
 */
public class TestAverage {

    public static List<String> result(BigDecimal... scores){
        BigDecimal scoreSum = Arrays.stream(scores)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal average = scoreSum.divide(BigDecimal.valueOf(scores.length),2,
                RoundingMode.HALF_UP);

//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < scores.length; i++) {
//            String format = String.format("Score %d : %.2f", i + 1, scores[i]);
//            result.add(format);
//        }
        List<String> result = IntStream.range(0, scores.length)
                .mapToObj(i -> String.format("Score %d : %.2f", i + 1, scores[i]))
                .collect(Collectors.toList());
        result.add(String.format("Average : %.2f", average));
        return result;
    }


}

/*
    Learning point
    -> Always use scale as 2 when use divide method of BigDecimal otherwise you will get unpredictable output with point
    -> Use reduce method with Zero accumulator when need to do all value sum with BigDecimal
    -> You can refactor legacy for loop with IntStream range method along with mapToObj() method and then collect
 */
