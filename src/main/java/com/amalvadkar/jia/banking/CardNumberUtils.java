package com.amalvadkar.jia.banking;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CardNumberUtils {

    private static final Logger logger = Logger.getLogger(CardNumberUtils.class.getName());

    /*
        "1234-5678-9876-5432"
        "****-****-****-5432"
     */
    public static String maskCardNumber(String cardNumber){
        String maskedCardNumbers = cardNumber.substring(0, 15)
                .replaceAll("[0-9]", "*");
        logger.log(Level.INFO, "maskedCardNumbers = {0}", maskedCardNumbers);

        String endedVisibleFourNumbers = cardNumber.substring(15, 19);
        logger.log(Level.INFO, "endedVisibleFourNumbers = {0}", endedVisibleFourNumbers);

        return maskedCardNumbers + endedVisibleFourNumbers;
    }

}
