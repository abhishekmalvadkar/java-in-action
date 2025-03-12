package com.amalvadkar.jia.banking;

import java.util.List;

import static java.util.Objects.isNull;

public class UpiUtils {

    private static final List<String> VALID_PROVIDERS = List.of("icici", "paytm");

    public static boolean isValidUpiId(String upiId){
        return upiId.matches("[a-zA-Z0-9]+@[(paytm | icici)]+");
    }

    public static String findInvalidUpiIdReason(String upiId){

        if (missingUpiId(upiId)) {
            return "missing upiId";
        }

        if (missingUpiDelimiter(upiId)){
            return "missing @ symbol";
        }

        if (missingUsername(upiId)){
            return "missing username";
        }

        String upiProvider = extractUpiProvider(upiId);
        if (missingUpiProvider(upiProvider)){
            return "missing upi provider";
        }
        if (invalidUpiProvider(upiProvider)){
            return "invalid upi provider";
        }


        if (isNotValid(upiId)){
            return "invalid upi";
        }

        return "";
    }

    private static boolean missingUpiId(String upiId) {
        return isNull(upiId);
    }

    private static boolean missingUpiProvider(String upiProvider) {
        return upiProvider.trim().isEmpty();
    }

    private static String extractUpiProvider(String upiId) {
        int delimiterIndex = upiId.indexOf("@");
        return upiId.substring(delimiterIndex + 1);
    }

    private static boolean missingUsername(String upiId) {
        return upiId.charAt(0) == '@';
    }

    private static boolean invalidUpiProvider(String upiProvider) {
        return !VALID_PROVIDERS.contains(upiProvider);
    }

    private static boolean missingUpiDelimiter(String upiId) {
        return !upiId.contains("@");
    }

    private static boolean isNotValid(String upiId) {
        return !isUpiId(upiId);
    }

    private static boolean isUpiId(String upiId) {
        return isValidUpiId(upiId);
    }


}
