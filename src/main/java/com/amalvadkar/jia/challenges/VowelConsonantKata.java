package com.amalvadkar.jia.challenges;

/*
    Write a program to identify if the character is a vowel or consonant
 */
public class VowelConsonantKata {

    public static String check(char inputChar){
        char[] vowels = {'a', 'e', 'i', 'o', 'u' , 'A', 'E', 'I', 'O', 'U'};
        boolean isVowel = false;

        for(int i = 0; i< vowels.length; i++){
            if (vowels[i] == inputChar){
                isVowel = true;
                break;
            }
        }

        if (isVowel){
            return "vowel";
        } else if ((inputChar > 'a' && inputChar <='z') || inputChar > 'A' && inputChar <='Z'){
            return "consonant";
        } else {
            return "invalid";
        }
    }

    /*
        vowel = a,e,i,o,u
        consonant = others

     */

}
