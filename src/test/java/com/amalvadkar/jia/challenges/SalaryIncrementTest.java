package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class SalaryIncrementTest {

    @Test
    void run_test() {
        BigDecimal salary = new BigDecimal("500.23");
        BigDecimal incrementAmount = new BigDecimal("130.45");
        assertThat(SalaryIncrement.run(salary, incrementAmount))
                .isEqualTo(new BigDecimal("630.68"));
    }
}