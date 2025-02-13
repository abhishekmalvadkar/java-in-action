package com.amalvadkar.jia.challenges;

public class PatternMatchingRunner {

    public static String process(Object input) {

        if (input instanceof Integer value){
            return String.format("It is integer with value = %s", value);
        }

        if (input instanceof String value){
            return String.format("It is String with value = %s", value);
        }
        return "Invalid input";
    }
}
