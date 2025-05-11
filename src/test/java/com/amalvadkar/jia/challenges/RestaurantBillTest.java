package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class RestaurantBillTest {

    @Test
    void summary() {
        assertThat(RestaurantBill.summary(new BigDecimal("3000")))
                .containsExactly(
                        "Meal charge : 3000.00 Rs",
                        "Tax : 6.75%",
                        "Meal charge with tax : 3202.50 Rs",
                        "Tip : 20%",
                        "Tip amount : 640.50 Rs",
                        "Final meal charge with tax and tip : 3843.00 Rs"
                );
        assertThat(RestaurantBill.summary(new BigDecimal("100")))
                .containsExactly(
                        "Meal charge : 100.00 Rs",
                        "Tax : 6.75%",
                        "Meal charge with tax : 106.75 Rs",
                        "Tip : 20%",
                        "Tip amount : 21.35 Rs",
                        "Final meal charge with tax and tip : 128.10 Rs"
                );
    }
}