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

    @Test
    void reverse() {
        assertThat(StringProcessor.reverse("xyz"))
                .isEqualTo("zyx");
        assertThat(StringProcessor.reverse("I am good"))
                .isEqualTo("doog ma I");
    }

    @Test
    void isPalindrome() {
        assertThat(StringProcessor.isPalindrome("mam"))
                .isTrue();
        assertThat(StringProcessor.isPalindrome("Mam"))
                .isTrue();
        assertThat(StringProcessor.isPalindrome(null))
                .isFalse();
        assertThat(StringProcessor.isPalindrome(""))
                .isTrue();
    }
}