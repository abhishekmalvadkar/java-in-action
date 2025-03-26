package com.amalvadkar.jia.banking;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Locale;

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

    @Test
    void should_perform_currency_conversion() {
        /*
            1 INR = 0.012 USD
            1000 INR = ? -> 1000 * 0.012 = $ 12.00
         */
        assertThat(AmountUtils.convertCurrencyFromINR(
                new BigDecimal("1000") ,
                new BigDecimal("0.012") ,
                Locale.of("en", "US")))
                .isEqualTo("$12.00");
         /*
            1 INR = 0.85 EUR
            75000 INR = ? -> 75000 * 0.85 = 63750.00
         */
        assertThat(AmountUtils.convertCurrencyFromINR(
                new BigDecimal("75000") ,
                new BigDecimal("0.85") ,
                Locale.of("en", "IE")))
                .isEqualTo("€63,750.00");

    }
}