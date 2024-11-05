package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class CircuitBoardProfitTest {

    @Test
    void calculateProfitAmount() {
        assertThat(CircuitBoardProfit.calculateProfitAmount(
                new BigDecimal("400")
        )).isEqualTo(new BigDecimal("160.00"));

        assertThat(CircuitBoardProfit.calculateProfitAmount(
                new BigDecimal("60")
        )).isEqualTo(new BigDecimal("24.00"));

        assertThat(CircuitBoardProfit.calculateProfitAmount(
                new BigDecimal("100")
        )).isEqualTo(new BigDecimal("40.00"));
    }
}