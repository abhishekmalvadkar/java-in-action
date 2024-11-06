package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringManipulatorTest {

    @Test
    void processCity() {
        assertThat(StringManipulator.processCity("Surat"))
                .isEqualTo(
                        new CityResult(
                                5,
                                "SURAT",
                                "surat",
                                'S')
                );

        assertThat(StringManipulator.processCity("Pune"))
                .isEqualTo(
                        new CityResult(
                                4,
                                "PUNE",
                                "pune",
                                'P')
                );
    }
}