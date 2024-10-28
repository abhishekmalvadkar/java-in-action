package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge_2Test {

    @Test
    void run_test() {
        double salary = 500.23;
        double incrementAmount = 130.45;
        assertThat(Challenge_2.run(salary, incrementAmount))
                .isEqualTo(630.68);
    }
}