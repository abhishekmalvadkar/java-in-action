package com.amalvadkar.jia.challenges;

public class DigitsSumKata {

    public static int sum(int number) {

        int sum = 0;
        while(number != 0){
           int digit = number % 10;
           number = number/10;
           sum = sum + digit;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(123/10); // 12
        System.out.println(123 % 10); // 3

        System.out.println(12/10); // 1
        System.out.println(12 % 10); // 2

        System.out.println(1/10); // 0
        System.out.println(1 % 10); // 1
    }

    /*
        123

        1) take each part of input
        2) sum it

        123/10 = 12 , 3
        12/10 = 1, 2
        1/10 = 0 , 1
     */

}
