package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NameInitialTest {

    @Test
    void run() {
        assertThat(NameInitial.run("Abhi", "Malvadkar"))
                .isEqualTo("AM");
    }
}