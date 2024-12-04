package com.amalvadkar.jia.challenges;

import com.amalvadkar.jia.util.JavaInActionUtils;

import java.util.List;

/*
    Number Analysis

Write a class with a method that accepts a file path as its argument.
Assume the file contains a series of numbers, each written on a separate line.
The class should read the contents of the file into an array, and then displays the following data:

• The lowest number in the array
• The highest number in the array
• The total of the numbers in the array
• The average of the numbers in the array

Expected output :
                        lowest is 10
                        highest is 76
                        sum is 143
                        average is 35.75
 */
public class NumberAnalysis {

    public static String generateReport(String textFilePath){
        List<Integer> numbers = JavaInActionUtils.realAllIntegersFromTextFile(textFilePath);

        int lowestNumber = numbers.stream()
                .mapToInt(number -> number)
                .min()
                .orElseThrow();

        int highestNumber = numbers.stream()
                .mapToInt(number -> number)
                .max()
                .orElseThrow();

        int sum = numbers.stream()
                .mapToInt(number -> number)
                .sum();

        double average = numbers.stream()
                .mapToInt(number -> number)
                .average()
                .orElseThrow();

        return """
                        lowest is %d
                        highest is %d
                        sum is %d
                        average is %.2f
                        """.formatted(lowestNumber, highestNumber, sum, average);
    }

}
