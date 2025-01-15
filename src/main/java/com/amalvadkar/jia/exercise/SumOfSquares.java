package com.amalvadkar.jia.exercise;

import java.util.stream.IntStream;

public class SumOfSquares {

    public static int calculateSumOfSquares(int n) {
        if (n < 0){
            return -1;
        }

        // e.g n = 2 -> 1^2 + 2^2 = 1 + 4 = 5
        return IntStream.rangeClosed(1, n)
                .map(SumOfSquares::square)
                .sum();
    }

    private static int square(int index) {
        return index * index;
    }
}
