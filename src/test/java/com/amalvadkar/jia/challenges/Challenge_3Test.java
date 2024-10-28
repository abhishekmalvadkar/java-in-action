package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge_3Test {

    @Test
    void run_test() {
        assertThat(Challenge_3.run(new TaskCsvDTO("Fix issue", "P10",
                "A", "12-12-2024")))
                .hasSize(3)
                .containsExactlyInAnyOrder("Incorrect priority",
                        "Incorrect story point",
                        "Incorrect due date");

        assertThat(Challenge_3.run(new TaskCsvDTO("Fix issuegggggggggggggggggggggggggggsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "P10",
                "A", "12-12-2024")))
                .hasSize(4)
                .containsExactlyInAnyOrder("Incorrect priority",
                        "Title should not have more than 50 character",
                        "Incorrect story point",
                        "Incorrect due date");

        assertThat(Challenge_3.run(new TaskCsvDTO("Css issue",
                "P4",
                "2",
                "12/12/2024")))
                .isEmpty();


    }
}