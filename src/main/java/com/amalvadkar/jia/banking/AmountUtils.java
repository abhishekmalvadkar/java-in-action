package com.amalvadkar.jia.banking;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class AmountUtils {

    public static String formatInrAmount(BigDecimal amount) {
        // Approach 1
        // NumberFormat inrNumberFormat = NumberFormat.getInstance(Locale.forLanguageTag("en-IN"));

        // Approach 2
//        Locale indiaLocale = new Locale.Builder()
//                .setLanguage("en").setRegion("IN").build();
//        NumberFormat inrNumberFormat = NumberFormat.getInstance(
//                indiaLocale);

        // Approach 3
        NumberFormat inrNumberFormat = NumberFormat.getInstance(Locale.of("en", "IN"));
        return inrNumberFormat.format(amount);
    }

}
