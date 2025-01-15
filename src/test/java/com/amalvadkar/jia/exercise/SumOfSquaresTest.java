package com.amalvadkar.jia.exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfSquaresTest {

    @Test
    void should_return_minus_1_if_passed_input_is_less_then_0() {
        assertThat(SumOfSquares.calculateSumOfSquares(-2))
                .isEqualTo(-1);
    }

    @Test
    void should_return_sum_of_squares_till_passed_input_number() {
        assertThat(SumOfSquares.calculateSumOfSquares(2))
                .isEqualTo(5);
        assertThat(SumOfSquares.calculateSumOfSquares(3))
                .isEqualTo(14);
    }
}