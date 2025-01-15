package com.amalvadkar.jia.exercise;

public class SumOfSquares {

    public static int calculateSumOfSquares(int n) {
        if (n == 0){
            return -1;
        }

        // e.g n = 2 -> 1^2 + 2^2 = 1 + 4 = 5
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            sum = sum + square;
        }
        return sum;
    }
}
