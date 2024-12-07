package com.amalvadkar.jia.challenges;

/*
    Write a Program to Identify if the Character is an Alphabet or not
 */
public class AlphabetKata {

    public static boolean isAlphabet(char inputChar) {

        // Naive approach
        if ((inputChar >= 'a' && inputChar <= 'z')) {
            return true;
        }

        if ((inputChar >= 'A' && inputChar <= 'Z')){
            return true;
        }
        return false;


          /*
          Refactored approach
          return (inputChar >= 'a' && inputChar <= 'z') ||
              (inputChar >= 'A' && inputChar <= 'Z');
         */

        // Approach 3
        // return Character.isAlphabetic(inputChar);
    }

    /*

     */

}
