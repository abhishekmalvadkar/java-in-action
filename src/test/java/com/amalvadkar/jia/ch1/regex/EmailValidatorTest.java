package com.amalvadkar.jia.ch1.regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    @Test
    void isValid() {
        assertThat(EmailValidator.isValid("john.doe123@example.com"))
                .isTrue();
        assertThat(EmailValidator.isValid("john@ex@ample.com"))
                .isFalse();
        assertThat(EmailValidator.isValid("john.doe123@example.org"))
                .isTrue();
    }
}