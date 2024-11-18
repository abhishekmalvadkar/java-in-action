package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeCalculatorTest {

    @Test
    void calculate() {
        assertThat(TimeCalculator.calculate(20L))
                .isEqualTo("20 second(s)");

        assertThat(TimeCalculator.calculate(120L))
                .isEqualTo("2.00 minute(s)");

        assertThat(TimeCalculator.calculate(165L))
                .isEqualTo("2.75 minute(s)");

        assertThat(TimeCalculator.calculate(175L))
                .isEqualTo("2.92 minute(s)");

        assertThat(TimeCalculator.calculate(7200L))
                .isEqualTo("2.00 hour(s)");

        assertThat(TimeCalculator.calculate(7800L))
                .isEqualTo("2.17 hour(s)");

        assertThat(TimeCalculator.calculate(172800L))
                .isEqualTo("2.00 day(s)");

        assertThat(TimeCalculator.calculate(182800L))
                .isEqualTo("2.12 day(s)");
    }
}