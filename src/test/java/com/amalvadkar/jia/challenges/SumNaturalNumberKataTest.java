package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumNaturalNumberKataTest {

    @Test
    void sum() {
        assertThat(SumNaturalNumberKata.sum(3))
                .isEqualTo(6);

        assertThat(SumNaturalNumberKata.sum(5))
                .isEqualTo(15);
    }
}