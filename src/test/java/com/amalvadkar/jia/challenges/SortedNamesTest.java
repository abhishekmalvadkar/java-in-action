package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortedNamesTest {

    @Test
    void sortAsc() {
        assertThat(SortedNames.sortAsc(
                "Charlie",
                "Leslie",
                "Andy"
        )).containsExactly(
                "Andy",
                "Charlie",
                "Leslie"
        );
    }
}