package com.amalvadkar.jia.challenges.chargeaccountvalidation;

import java.util.List;
import java.util.function.Predicate;

/*
    Charge Account Validation

Create a class with a method that accepts a charge account number as its argument.
The method should determine whether the number is valid by comparing it to the following list of valid charge account numbers:

 5658845 4520125 7895122 8777541 8451277 1302850
 8080152 4562555 5552012 5050552 7825877 1250255
 1005231 6545231 3852085 7576651 7881200 4581002

These numbers should be stored in an array or an ArrayList object.
Use a sequential search to locate the number passed as an argument.
If the number is in the array, the method should return true, indicating the number is valid.
If the number is not in the array, the method should return false, indicating the number is invalid.
Write a program that tests the class by asking the user to enter a charge account number.
The program should display a message indicating whether the number is valid or invalid.
 */
public class ChargeAccountValidator {

    public static String validateChargeAccountNumber(Integer chargeAccountNumber){
        List<Integer> validChargeAccountNumbers = getValidChargeAccountNumberList();

        // Approach 1
//         boolean isAccountNumberPresentInValidList = validChargeAccountNumbers.contains(chargeAccountNumber);

        // Approach 2
//         boolean isAccountNumberPresentInValidList =  validChargeAccountNumbers.indexOf(chargeAccountNumber) >=0;

        // Approach 3
//        boolean isAccountNumberPresentInValidList = false;
//        for (Integer validChargeAccountNumber : validChargeAccountNumbers) {
//            if (chargeAccountNumber.equals(validChargeAccountNumber)){
//                isAccountNumberPresentInValidList = true;
//                break;
//            }
//        }

        // Approach 4
//        boolean isAccountNumberPresentInValidList = isNumberPresent(chargeAccountNumber, validChargeAccountNumbers);

        // Approach 4
        // boolean test(T t);
//        Predicate<Integer> isAccountNumberMatchPredicate = number -> chargeAccountNumber.equals(number);
        Predicate<Integer> isAccountNumberMatchPredicate = chargeAccountNumber::equals;
        boolean isAccountNumberPresentInValidList = validChargeAccountNumbers.stream()
                .anyMatch(isAccountNumberMatchPredicate);

        if (isAccountNumberPresentInValidList){
            return "Charge account number is valid";
        } else {
            return "Charge account number is invalid";
        }
    }

    private static boolean isNumberPresent(Integer chargeAccountNumber, List<Integer> validChargeAccountNumbers) {
        for (Integer validChargeAccountNumber : validChargeAccountNumbers) {
            if (chargeAccountNumber.equals(validChargeAccountNumber)){
               return true;
            }
        }
        return false;
    }

    private static List<Integer> getValidChargeAccountNumberList() {
        return List.of(
                5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
                8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                1005231, 6545231, 3852085, 7576651, 7881200, 4581002
        );
    }

}
