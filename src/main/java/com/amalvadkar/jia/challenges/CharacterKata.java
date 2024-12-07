package com.amalvadkar.jia.challenges;

public class CharacterKata {

    private static final char[] numbersCharArray = {'0', '1','2','3','4','5','6','7','8','9'};

    public static String checkChar(char inputChar) {

        if ((inputChar >= 'a' && inputChar <= 'z') ||
            (inputChar >= 'A' && inputChar <= 'Z')){
            return "alphabet";
        }

        for (int i = 0; i < numbersCharArray.length; i++){
            if (numbersCharArray[i] == inputChar){
                return "number";
            }
        }

        return "other symbol";
    }

}
