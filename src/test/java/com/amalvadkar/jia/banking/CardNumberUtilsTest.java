package com.amalvadkar.jia.banking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardNumberUtilsTest {

    /*
        Requirement: Write a utility method that masks a
        credit/debit card number, showing only the last 4 digits.

        Example:
        Input: "1234-5678-9876-5432"
        Output: "****-****-****-5432"
     */
    @Test
    void maskCardNumber() {
        assertThat(CardNumberUtils.maskCardNumber("1234-5678-9876-5432")).
            isEqualTo("****-****-****-5432");
    }
}