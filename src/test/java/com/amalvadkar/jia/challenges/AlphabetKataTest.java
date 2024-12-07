package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlphabetKataTest {

    @Test
    void isAlphabet() {
        assertThat(AlphabetKata.isAlphabet('a'))
                .isTrue();
        assertThat(AlphabetKata.isAlphabet('g'))
                .isTrue();
        assertThat(AlphabetKata.isAlphabet('A'))
                .isTrue();

        assertThat(AlphabetKata.isAlphabet('3'))
                .isFalse();

        assertThat(AlphabetKata.isAlphabet('/'))
                .isFalse();
    }
}