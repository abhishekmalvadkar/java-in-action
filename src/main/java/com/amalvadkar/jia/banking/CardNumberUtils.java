package com.amalvadkar.jia.banking;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CardNumberUtils {

    private static final Logger logger = Logger.getLogger(CardNumberUtils.class.getName());
    private static final String NUMBER_ONLY_REGEX = "[0-9]";
    public static final String MASK_SYMBOL = "*";

    /*
        "1234-5678-9876-5432"
        "****-****-****-5432"
     */
    public static String maskCardNumber(String cardNumber){
        String maskedCardNumbers = cardNumber.substring(0, 15)
                .replaceAll(NUMBER_ONLY_REGEX, MASK_SYMBOL);
        logger.log(Level.INFO, "maskedCardNumbers = {0}", maskedCardNumbers);

        String endedVisibleFourNumbers = cardNumber.substring(15, 19);
        logger.log(Level.INFO, "endedVisibleFourNumbers = {0}", endedVisibleFourNumbers);

        return maskedCardNumbers + endedVisibleFourNumbers;
    }

}
