package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringProcessorTest {

    @Test
    void countWord() {
        assertThat(StringProcessor.countWord("Hello World"))
                .isEqualTo(2);
        assertThat(StringProcessor.countWord("Hello  World"))
                .isEqualTo(2);
        assertThat(StringProcessor.countWord("I  am   good"))
                .isEqualTo(3);
        assertThat(StringProcessor.countWord("Bye"))
                .isEqualTo(1);
    }
}