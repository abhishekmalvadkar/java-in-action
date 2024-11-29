package com.amalvadkar.jia.challenges.sorting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortProductsTest {

    @Test
    void should_return_products_sorted_by_price_asc() {
        assertThat(SortProducts.byPriceAsc(
                List.of(
                        new Product("Laptop", new BigDecimal("1200.00")),
                        new Product("Mouse", new BigDecimal("25.50")),
                        new Product("Keyboard", new BigDecimal("45.00"))
                )
        )).containsExactly(
                        new Product("Mouse", new BigDecimal("25.50")),
                        new Product("Keyboard", new BigDecimal("45.00")),
                        new Product("Laptop", new BigDecimal("1200.00"))

        );
    }
}