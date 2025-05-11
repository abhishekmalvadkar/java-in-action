package com.amalvadkar.jia.exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DimensionTest {

    @Test
    void should_create_dimension_object_with_valid_state() {
        Dimension dimension = new Dimension(24);
        assertThat(dimension.getInches()).isEqualTo(24);
        assertThat(dimension.getFeet()).isEqualTo(2);
    }

}