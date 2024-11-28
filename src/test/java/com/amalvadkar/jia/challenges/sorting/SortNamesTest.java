package com.amalvadkar.jia.challenges.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortNamesTest {

    @Test
    void should_sort_names_in_asc_order_with_case_insensitive() {
        assertThat(SortNames.sort(
                "asc",
                "Charlie","Alice", "david", "bob"
                ))
                .containsExactly(
                        "Alice", "bob", "Charlie", "david"
                );
    }

    @Test
    void should_sort_names_in_desc_order_with_case_insensitive() {
        assertThat(SortNames.sort(
                "desc",
                "Charlie","Alice", "david", "bob"
        ))
                .containsExactly(
                        "david", "Charlie", "bob", "Alice"
                );
    }
}