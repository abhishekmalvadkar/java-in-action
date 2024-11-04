package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class TestAverageTest {

    @Test
    void result() {
        assertThat(TestAverage.result(
                new BigDecimal("10"),
                new BigDecimal("20"),
                new BigDecimal("30")
        )).containsExactly("Score 1 : 10.00",
                "Score 2 : 20.00",
                "Score 3 : 30.00",
                "Average : 20.00");

        assertThat(TestAverage.result(
                new BigDecimal("12.23"),
                new BigDecimal("23.78"),
                new BigDecimal("27.15")
        )).containsExactly("Score 1 : 12.23",
                "Score 2 : 23.78",
                "Score 3 : 27.15",
                "Average : 21.05");
    }
}