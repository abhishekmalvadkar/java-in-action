package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/*
    Implement a method that takes an Object and returns a string
    based on its type (Integer, String) and return Invalid input for
    other types
 */
class PatternMatchingRunnerTest {

    @Test
    void should_return_string_based_on_input_type() {
        assertThat(PatternMatchingRunner.process(Integer.valueOf(1))).
                isEqualTo("It is integer with value = 1");
        assertThat(PatternMatchingRunner.process("Hello")).
                isEqualTo("It is String with value = Hello");
        assertThat(PatternMatchingRunner.process(BigDecimal.ONE)).
                isEqualTo("Invalid input");

    }

}