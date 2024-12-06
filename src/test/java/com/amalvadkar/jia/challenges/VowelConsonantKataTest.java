package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VowelConsonantKataTest {

    @Test
    void check() {
        assertThat(VowelConsonantKata.check('a'))
                .isEqualTo("vowel");

        assertThat(VowelConsonantKata.check('c'))
                .isEqualTo("consonant");

        assertThat(VowelConsonantKata.check('u'))
                .isEqualTo("vowel");

        assertThat(VowelConsonantKata.check('A'))
                .isEqualTo("vowel");

        assertThat(VowelConsonantKata.check('3'))
                .isEqualTo("invalid");

        assertThat(VowelConsonantKata.check('$'))
                .isEqualTo("invalid");
    }
}