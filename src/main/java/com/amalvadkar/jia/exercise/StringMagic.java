package com.amalvadkar.jia.exercise;

import java.util.Objects;

public class StringMagic {

    public static int countUppercaseLetter(String content){

        if (Objects.isNull(content)) {
            return -1;
        }

        int uppercaseLetterCount = 0;

        // Approach 1 - Low level code
        /*for (var positionIndex = 0; positionIndex < content.length(); positionIndex++) {
            char currentCharacter = content.charAt(positionIndex);
            if (isUppercase(currentCharacter)){
                uppercaseLetterCount++;
            }
        }*/

        for (var positionIndex = 0; positionIndex < content.length(); positionIndex++) {
            char currentCharacter = content.charAt(positionIndex);
            if (Character.isUpperCase(currentCharacter)){
                uppercaseLetterCount++;
            }
        }
        return uppercaseLetterCount;
    }

    private static boolean isUppercase(char currentCharacter) {
        return currentCharacter >= 'A' && currentCharacter <= 'Z';
    }
}
