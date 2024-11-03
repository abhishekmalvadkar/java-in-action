package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class EqualsKataTest {

    @Test
    void run() {
        assertThat(EqualsKata.run(
                new Task(1L, "Daily meeting", LocalDate.now(), "Pending"),
                new Task(1L, "Daily meeting", LocalDate.now(), "Pending")
        )).isTrue();

        assertThat(EqualsKata.run(
                new Task(1L, "Daily meeting", LocalDate.now(), "Pending"),
                new Task(2L, "Daily meeting", LocalDate.now(), "Pending")
        )).isFalse();

        Task first = new Task(1L, "Daily meeting", LocalDate.now(), "Pending");
        assertThat(EqualsKata.run(
                first,
                first
        )).isTrue();

        assertThat(EqualsKata.run(
                new Task(1L, "Daily meeting", LocalDate.now(), "Pending"),
                getSecond()
        )).isFalse();

        assertThat(EqualsKata.run(
                new Task(1L, "Daily meeting", LocalDate.now(), "Pending"),
                "My task"
        )).isFalse();
    }

    private static Object getSecond() {
        return null;
    }
}