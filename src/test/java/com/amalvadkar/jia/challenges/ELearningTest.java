package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ELearningTest {

    @Test
    void should_return_course_duration_in_hour_from_minutes() {
        assertThat(ELearning.prepareCourseDurationText(50))
                .isEqualTo("50m");
        assertThat(ELearning.prepareCourseDurationText(60))
                .isEqualTo("1h");
        assertThat(ELearning.prepareCourseDurationText(90))
                .isEqualTo("1h 30m");
        assertThat(ELearning.prepareCourseDurationText(121))
                .isEqualTo("2h 1m");
    }
}