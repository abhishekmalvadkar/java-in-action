package com.amalvadkar.jia.banking;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class AmountUtilsTest {

    @Test
    void formatInrAmount() {
        assertThat(AmountUtils.formatInrAmount(new BigDecimal("1000"))).
        isEqualTo("1,000");
        assertThat(AmountUtils.formatInrAmount(new BigDecimal("1234567"))).
        isEqualTo("1,234,567");
    }

    @Test
    void should_return_amount_in_words() {
        assertThat(AmountUtils.convertAmountToWords(1234L))
                .isEqualTo("One Thousand Two Hundred Thirty-Four");
    }

    @Test
    void should_format_amount_with_inr_symbol() {
        assertThat(AmountUtils.formatAmountWithINR(new BigDecimal("9999.50")))
                .isEqualTo("₹9,999.50");
    }
}