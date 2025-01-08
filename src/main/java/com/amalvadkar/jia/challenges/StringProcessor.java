package com.amalvadkar.jia.challenges;

import java.util.regex.Pattern;

public interface StringProcessor {

    String ANY_NUMBER_OF_SPACE_DELIMETER = "\\s+";

    static int countWord(String content){
        // Approach 1 - screaming that we need regex
       return Pattern.compile(ANY_NUMBER_OF_SPACE_DELIMETER)
                .split(content).length;

        // Approach 2 - Not screaming that we need regex so developer can do mistake by passing just literal which can be understandable in different wat (e.g .(dot means any character))
        // return content.split(ANY_NUMBER_OF_SPACE_DELIMETER).length;
    }

    /*
        Reverse a string while preserving the position of spaces.
     */
    static String reverse(String content){

        // Approach 1 : Very low level
//        StringBuilder reversedBuilder = new StringBuilder();
//        for (int i = content.length() - 1; i >= 0; i--) {
//            reversedBuilder.append(content.charAt(i));
//        }
//        return reversedBuilder.toString();

        // Approach 2 : Using predefined method
        StringBuilder reversedBuilder = new StringBuilder(content);
        return reversedBuilder.reverse().toString();
    }

}
