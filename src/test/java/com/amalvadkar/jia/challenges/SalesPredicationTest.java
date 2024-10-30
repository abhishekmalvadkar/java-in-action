package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class SalesPredicationTest {

    @Test
    void run() {
        BigDecimal totalSales = new BigDecimal("4600000");
        BigDecimal percentage = new BigDecimal("0.62");
        assertThat(SalesPredication.run(totalSales, percentage))
                .isEqualTo(new BigDecimal("2852000.00"));
    }
}