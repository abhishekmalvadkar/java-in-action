package com.amalvadkar.jia.ch1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class BirthdayAgeRevisitedTest {

    @Test
    @Disabled("This test is dependent on date and time and hence disabled")
    void provideAge() {
        assertThat(BirthdayAgeRevisited.provideAge(
                new EmployeeEntity(1L, "user1",
                        LocalDate.of(2000,4, 15))
        )).isEqualTo("24 years 6 months 26 days");
    }
}