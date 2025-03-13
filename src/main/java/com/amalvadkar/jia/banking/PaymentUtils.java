package com.amalvadkar.jia.banking;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class PaymentUtils {


    private static final DateTimeFormatter PAYMENT_REFERENCE_DATE_FORMATTER =
            DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final String START = "PAY";
    private static final String DASH = "-";

    /*
        PAY20250314123045-8372
     */
    public static String generatePaymentReferenceNumber(){
        return START + prepareTimeStamp() + DASH + generateUnique4DigitNumber();
    }

    private static int generateUnique4DigitNumber() {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }

    private static String prepareTimeStamp() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        return PAYMENT_REFERENCE_DATE_FORMATTER.format(zonedDateTime);
    }

}
