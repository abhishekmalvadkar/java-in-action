package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class SalesTaxTest {

    @Test
    void preparePurchaseSummaryMessages() {
        assertThat(SalesTax.preparePurchaseSummaryMessages(new BigDecimal("150")))
                .containsExactly(
                        "Purchase amount : 150.00 Rs",
                        "State sales tax = 4%",
                        "Country sales tax = 2%",
                        "Total sales tax = 6%",
                        "Total amount = 159.00 Rs"

                );

        assertThat(SalesTax.preparePurchaseSummaryMessages(new BigDecimal("30")))
                .containsExactly(
                        "Purchase amount : 30.00 Rs",
                        "State sales tax = 4%",
                        "Country sales tax = 2%",
                        "Total sales tax = 6%",
                        "Total amount = 31.80 Rs"

                );

        assertThat(SalesTax.preparePurchaseSummaryMessages(new BigDecimal("20.00")))
                .containsExactly(
                        "Purchase amount : 20.00 Rs",
                        "State sales tax = 4%",
                        "Country sales tax = 2%",
                        "Total sales tax = 6%",
                        "Total amount = 21.20 Rs"

                );
    }
}