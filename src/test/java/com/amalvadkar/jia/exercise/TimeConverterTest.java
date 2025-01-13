package com.amalvadkar.jia.exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeConverterTest {

    @Test
    void convertHoursToMinutes() {
        assertThat(TimeConverter.convertHoursToMinutes(2))
                .isEqualTo(120);
        assertThat(TimeConverter.convertHoursToMinutes(5))
                .isEqualTo(300);
    }

    @Test
    void convertDaysToMinutes() {
        assertThat(TimeConverter.convertDaysToMinutes(1))
                .isEqualTo(1440);
        assertThat(TimeConverter.convertDaysToMinutes(5))
                .isEqualTo(7200);
    }
}