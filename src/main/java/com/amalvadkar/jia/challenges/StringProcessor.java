package com.amalvadkar.jia.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public interface StringProcessor {

    String ANY_NUMBER_OF_SPACE_DELIMITER = "\\s+";

    static int countWord(String content){
        // Approach 1 - screaming that we need regex
       return Pattern.compile(ANY_NUMBER_OF_SPACE_DELIMITER)
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

    /*
        Detect whether a string is a palindrome (case-insensitive).
     */
    static boolean isPalindrome(String content){
        if (Objects.isNull(content)) return false;

        String reversedContent = reverse(content);
        return reversedContent.equalsIgnoreCase(content);
    }

    static String titleCase(String content) {
        String[] words = Pattern.compile(ANY_NUMBER_OF_SPACE_DELIMITER).split(content);
        List<String> titleCaseWords = new ArrayList<>();
        for (String word : words) {
            String titleCaseWord = convertToTitleCase(word);
            titleCaseWords.add(titleCaseWord);
        }
        return String.join(" ", titleCaseWords);
    }

    static String convertToTitleCase(String word) {
        StringBuilder titleCaseWorldBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (i == 0){
                titleCaseWorldBuilder.append(Character.toUpperCase(currentChar));
            } else {
                titleCaseWorldBuilder.append(Character.toLowerCase(currentChar));
            }

        }
        return titleCaseWorldBuilder.toString();
    }
}
