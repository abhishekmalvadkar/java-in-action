package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class LandCalculationTest {

    @Test
    void test_calculate_acre() {
        BigDecimal inputSquareFeet = new BigDecimal("389767");
        BigDecimal expectedAcer = new BigDecimal("8.95");
        assertThat(LandCalculation.calculateAcre(inputSquareFeet))
                .isEqualTo(expectedAcer);
    }
}