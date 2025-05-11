package com.amalvadkar.jia.rushitest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleOneTest {

    @Test
    void checkGivenNumberIsDigits() {

        assertThat(ExampleOne.checkGivenNumberIsDigits('1')).isTrue();
        assertThat(ExampleOne.checkGivenNumberIsDigits('9')).isTrue();
        assertThat(ExampleOne.checkGivenNumberIsDigits('a')).isFalse();
        assertThat(ExampleOne.checkGivenNumberIsDigits('D')).isFalse();
    }


    @Test
    void checkGivenNumberIsSym() {

        assertThat(ExampleOne.checkIsSymbole('%')).isTrue();
        assertThat(ExampleOne.checkIsSymbole('$')).isTrue();
        assertThat(ExampleOne.checkIsSymbole('a')).isFalse();
        assertThat(ExampleOne.checkIsSymbole('A')).isFalse();
        assertThat(ExampleOne.checkIsSymbole('1')).isFalse();


    }

    @Test
    void sumOfNaturelNumber() {
       assertThat(ExampleOne.giveSumOfNaturalNum(5)).isEqualTo(15);
        assertThat(ExampleOne.giveSumOfNaturalNum(10)).isEqualTo(55);
    }

}