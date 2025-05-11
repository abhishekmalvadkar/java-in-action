package com.amalvadkar.jia.ch1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class BirthdayAgeRevisitedTest {

    @Test
    void provideAge() {
        assertThat(BirthdayAgeRevisited.provideAge(
                new EmployeeEntity(1L, "user1",
                        LocalDate.of(2000,4, 15))
        )).isEqualTo("24 years 6 months 26 days");
    }
}