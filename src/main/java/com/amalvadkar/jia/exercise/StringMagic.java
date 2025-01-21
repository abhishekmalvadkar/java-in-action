package com.amalvadkar.jia.exercise;

public class StringMagic {

    public static int countUppercaseLetter(String content){
        int uppercaseLetterCount = 0;
        for (var positionIndex = 0; positionIndex < content.length(); positionIndex++) {
            char currentCharacter = content.charAt(positionIndex);
            if (isUppercase(currentCharacter)){
                uppercaseLetterCount++;
            }
        }
        return uppercaseLetterCount;
    }

    private static boolean isUppercase(char currentCharacter) {
        return currentCharacter >= 'A' && currentCharacter <= 'Z';
    }
}
