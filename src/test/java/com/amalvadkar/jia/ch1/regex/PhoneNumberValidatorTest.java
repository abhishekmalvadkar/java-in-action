package com.amalvadkar.jia.ch1.regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneNumberValidatorTest {

    @Test
    void isValid() {
        assertThat(PhoneNumberValidator.isValid("(555) 123-4567"))
                .isTrue();
        assertThat(PhoneNumberValidator.isValid("(800) 555-1234"))
                .isTrue();
        assertThat(PhoneNumberValidator.isValid("(123) 456-7890"))
                .isTrue();

        assertThat(PhoneNumberValidator.isValid("555-123-4567"))
                .isFalse();
        assertThat(PhoneNumberValidator.isValid("(555) 123-45678"))
                .isFalse();
        assertThat(PhoneNumberValidator.isValid("123-456-7890"))
                .isFalse();
        assertThat(PhoneNumberValidator.isValid("(555) abc-1234"))
                .isFalse();


    }
}