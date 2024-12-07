package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DigitsSumKataTest {

    @Test
    void should_do_sum() {
        assertThat(DigitsSumKata.sum(123))
                .isEqualTo(6);

        assertThat(DigitsSumKata.sum(12345))
                .isEqualTo(15);
    }
}