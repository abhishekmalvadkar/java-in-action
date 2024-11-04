package com.amalvadkar.jia.challenges;

/*
    Cookie Calories

    A bag of cookies holds 40 cookies. The calorie information on the bag claims that
    there are 10 servings in the bag and that a serving equals 300 calories.
    Write a program that lets the user enter the number of cookies he or she actually ate
    and then reports the number of total calories consumed.

    1 serving has 300 calorie
    10 serving will have ->  $totalCalorie

    40 cookies has -> $totalCalorie
    1 cookies will have -> ? ex : 50

 */
public class CookieCalories {

    public static final int TOTAL_COOKIES_IN_BAG = 40;
    public static final int TOTAL_SERVING_IN_BAG = 10;
    public static final int ONE_SERVING_CALORIE = 300;
    public static final int TOTAL_CALORIE_IN_BAG = TOTAL_SERVING_IN_BAG * ONE_SERVING_CALORIE;
    public static final int ONE_COOKIE_CALORIE = TOTAL_CALORIE_IN_BAG / TOTAL_COOKIES_IN_BAG;

    public static int calculate(int ateCookieCount){
        return ONE_COOKIE_CALORIE * ateCookieCount;
    }

}
