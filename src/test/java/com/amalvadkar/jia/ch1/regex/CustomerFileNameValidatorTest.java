package com.amalvadkar.jia.ch1.regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerFileNameValidatorTest {

    @Test
    void isValid() {
        assertThat(CustomerFileNameValidator.isValid("HDFC_02.10.2024.csv")).isTrue();
        assertThat(CustomerFileNameValidator.isValid("HDFC_0210.2024.csv")).isFalse();
        assertThat(CustomerFileNameValidator.isValid("_02.10.2024.csv")).isFalse();
        assertThat(CustomerFileNameValidator.isValid("HDFC_02.10..2024.csv")).isFalse();
        assertThat(CustomerFileNameValidator.isValid("6GH_02.10.2024.csv")).isFalse();
        assertThat(CustomerFileNameValidator.isValid("SBI_02.10.2024.txt")).isFalse();
    }
}