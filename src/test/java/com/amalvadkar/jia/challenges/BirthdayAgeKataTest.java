package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class BirthdayAgeKataTest {

    @Test
    void provideAge() {
        assertThat(BirthdayAgeKata.provideAge(
                new EmployeeEntity(
                        1L,
                        LocalDate.of(1990, 12, 19)
                )
        )).isEqualTo("33 years 10 months 20 days");

        assertThat(BirthdayAgeKata.provideAge(
                new EmployeeEntity(
                        1L,
                        LocalDate.of(2000, 1, 12)
                )
        )).isEqualTo("24 years 9 months 27 days");
    }
}