package com.amalvadkar.jia.exercise;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringMagicTest {

    @ParameterizedTest
    @CsvSource(value = {
            "hi How Are You?,   3",
            "I AM GOOD !!,      7",
            "that is good,      0",
            "'',                0",
            ",                  -1",
    })
    void countUppercaseLetter(String content , int uppercaseCount) {
//        assertThat(StringMagic.countUppercaseLetter("hi How Are You?"))
//                .isEqualTo(3);
//        assertThat(StringMagic.countUppercaseLetter("I AM GOOD !!"))
//                .isEqualTo(7);
//        assertThat(StringMagic.countUppercaseLetter("that is good"))
//                .isEqualTo(0);
//        assertThat(StringMagic.countUppercaseLetter(""))
//                .isEqualTo(0);
        assertThat(StringMagic.countUppercaseLetter(content)).isEqualTo(uppercaseCount);
    }
}