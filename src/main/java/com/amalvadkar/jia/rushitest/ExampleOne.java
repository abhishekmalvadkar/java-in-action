package com.amalvadkar.jia.rushitest;

import java.util.ArrayList;
import java.util.List;

public class ExampleOne {



//    1) Check given input character is digit or not?
//            2) Check given input character is alphabet or not?
//            3) Check given input character is other symbol or not?
//            4) Give sum of all digits form passed integer.
//            5) Give sum of n natural number's sum.
//



    public static boolean checkGivenNumberIsDigits(char value){
        List<String> list = new ArrayList<>();

        list.add("");


        char[] digit = {'0','1','2','3','4','5','6','7','8','9'};

                for(int i=0;i< digit.length;i++){

                    if(value==digit[i]){
                        return true;

                    }
                }

               return false;

    }


    public static boolean checkIsSymbole(char value) {

        char[] digit = {'0','1','2','3','4','5','6','7','8','9'};

        for(int i=0;i< digit.length;i++){

            if(value==digit[i]){
                return false;
            }
        }

        if((value>='a' && value<= 'z') || (value>='A' && value<= 'Z') ){
            return false;
        }

        return true;
    }

    public static int giveSumOfNaturalNum(int num){
             int sum = 0;
        for(int i=1;i<=num; i++){
            sum = sum + i;
        }
        return sum;
    }


    /*
      i/p 3
      1+2+3
     */

}
