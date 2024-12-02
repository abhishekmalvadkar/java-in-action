package com.amalvadkar.jia.challenges.chargeaccountvalidation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChargeAccountValidatorTest {

    @Test
    void validateChargeAccountNumber() {
        assertThat(ChargeAccountValidator.validateChargeAccountNumber(
                7825877
        )).isEqualTo("Charge account number is valid");

        assertThat(ChargeAccountValidator.validateChargeAccountNumber(
                7825872
        )).isEqualTo("Charge account number is invalid");
    }
}