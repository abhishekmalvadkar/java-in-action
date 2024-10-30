package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class NameAgeAndAnnualTest {

    @Test
    void run_test() {
        String name = "Joe Mahoney";
        int age = 26;
        assertThat(NameAgeAndAnnual.run(name, age, new BigDecimal("300")))
                .isEqualTo("""
                        My name is Joe Mahoney, my age is 26 and
                        I hope to earn $300.00 per year.
                        """);
        assertThat(NameAgeAndAnnual.run(name, age, new BigDecimal("567.789")))
                .isEqualTo("""
                        My name is Joe Mahoney, my age is 26 and
                        I hope to earn $567.79 per year.
                        """);
        assertThat(NameAgeAndAnnual.run(name, age, new BigDecimal("567.774")))
                .isEqualTo("""
                        My name is Joe Mahoney, my age is 26 and
                        I hope to earn $567.77 per year.
                        """);
        assertThat(NameAgeAndAnnual.run(name, age, new BigDecimal("567.12")))
                .isEqualTo("""
                        My name is Joe Mahoney, my age is 26 and
                        I hope to earn $567.12 per year.
                        """);
    }
}