package com.amalvadkar.jia.exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TimeConverterTest {

    public static Stream<Arguments> convertHoursToMinutesSource() {
        return Stream.of(
                arguments(2 , 120),
                arguments(5 , 300),
                arguments(-4 , -1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "convertHoursToMinutesSource")
    void convertHoursToMinutes(int hours , int minutes) {
//        assertThat(TimeConverter.convertHoursToMinutes(2))
//                .isEqualTo(120);
//        assertThat(TimeConverter.convertHoursToMinutes(5))
//                .isEqualTo(300);
//        assertThat(TimeConverter.convertHoursToMinutes(-4))
//                .isEqualTo(-1);
        assertThat(TimeConverter.convertHoursToMinutes(hours)).isEqualTo(minutes);
    }

    @Test
    void convertDaysToMinutes() {
        assertThat(TimeConverter.convertDaysToMinutes(1))
                .isEqualTo(1440);
        assertThat(TimeConverter.convertDaysToMinutes(5))
                .isEqualTo(7200);
        assertThat(TimeConverter.convertDaysToMinutes(-5))
                .isEqualTo(-1);
    }
}