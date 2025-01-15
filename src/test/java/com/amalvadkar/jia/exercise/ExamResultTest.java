package com.amalvadkar.jia.exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExamResultTest {

    @Test
    void should_return_true_if_marks_is_more_then_50() {
        assertThat(ExamResult.isPaas(51))
                .isTrue();
        assertThat(ExamResult.isPaas(60))
                .isTrue();
        assertThat(ExamResult.isPaas(90))
                .isTrue();
    }

    @Test
    void should_return_false_if_marks_is_less_then_or_equal_to_50() {
        assertThat(ExamResult.isPaas(50))
                .isFalse();
        assertThat(ExamResult.isPaas(49))
                .isFalse();
        assertThat(ExamResult.isPaas(31))
                .isFalse();
    }
}