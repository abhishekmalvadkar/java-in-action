package com.amalvadkar.jia.dailyproblem.array;

public class ExampleOne {

    // given integer having duplicate return true other wise return false


    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        for(int i=0;i<numbers.length;i++){

            for(int  j = i+1; j< numbers.length; j++ ){

                if(numbers[j]==numbers[i]){
                    System.out.println(true);
                    break;
                }
                else{
                    System.out.println("false = " + false);
                    break;
                }




            }
        }
    }



}
