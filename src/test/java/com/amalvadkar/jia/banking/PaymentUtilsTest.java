package com.amalvadkar.jia.banking;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentUtilsTest {

    /*
      Requirement:
      In a Google Pay-like payment system, each transaction should have a
      unique reference number. The reference number must:

      Start with "PAY" (indicating a payment).
      Include the current timestamp (YYYYMMDDHHMMSS).
      End with a random 4-digit number for uniqueness.

      Sample output : PAY20250314123045-8372
   */
    @Test
    void generatePaymentReferenceNumber() {
        assertThat(PaymentUtils.generatePaymentReferenceNumber()).
        startsWith("PAY");

        String response = PaymentUtils.generatePaymentReferenceNumber();
        assertThat(response).isNotNull();
        String timeStamp = response.substring(3, 17);
        assertThat(timeStamp).matches(Pattern.compile("[0-9]{14}"));

        String result = PaymentUtils.generatePaymentReferenceNumber();
        assertThat(result).isNotNull();
        String referenceNumberEnd = result.substring(17, 22);
        assertThat(referenceNumberEnd).matches(Pattern.compile("-[0-9]{4}"));
    }
}