package com.amalvadkar.jia.exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringMagicTest {

    @Test
    void countUppercaseLetter() {
        assertThat(StringMagic.countUppercaseLetter("hi How Are You?"))
                .isEqualTo(3);
        assertThat(StringMagic.countUppercaseLetter("I AM GOOD !!"))
                .isEqualTo(7);
        assertThat(StringMagic.countUppercaseLetter("that is good"))
                .isEqualTo(0);
        assertThat(StringMagic.countUppercaseLetter(""))
                .isEqualTo(0);
    }
}