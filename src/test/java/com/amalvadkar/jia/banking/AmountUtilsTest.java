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
}