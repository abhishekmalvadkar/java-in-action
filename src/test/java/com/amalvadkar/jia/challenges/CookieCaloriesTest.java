package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CookieCaloriesTest {

    @Test
    void calculate() {
        assertThat(CookieCalories.calculate(40))
                .isEqualTo(3000);

        assertThat(CookieCalories.calculate(9))
                .isEqualTo(675);
    }
}