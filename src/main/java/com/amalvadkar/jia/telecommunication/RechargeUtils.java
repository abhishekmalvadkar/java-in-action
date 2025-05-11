package com.amalvadkar.jia.telecommunication;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

public class RechargeUtils {
    public static boolean isValidPhoneNumber(String number) {
        String mobileRegex = "^[6789][0-9]{9}";
        Pattern compile = Pattern.compile(mobileRegex);
        return compile.matcher(number).matches();
    }


    public static boolean isValidRechargeAmount(BigDecimal amount)
     {
         return amount.compareTo(BigDecimal.valueOf(10))>=0 && amount.compareTo(BigDecimal.valueOf(5000)) <=0;
    }


    public static String recharge(String message){

        List<String> providers = List.of("AIRTEL", "JIO", "VI","BSNL");
        String[] rechargeInfo = message.split(" ");
        System.out.println("rechargeInfo = " + rechargeInfo.length);
        if(rechargeInfo.length != 3){
            return "mobile number or amount or provider should not me missing";
        }
        if (!isValidPhoneNumber(rechargeInfo[0].trim())) {
            return "mobile no is not valid";
        }
        if(!isValidRechargeAmount(new BigDecimal(rechargeInfo[1]))){
            return "amount not should be between 10 - 5000";
        }
        if(! providers.contains(rechargeInfo[2].toUpperCase())){
            return "provider not mathced";
        }
        return "recharge successfully";
    }
}
