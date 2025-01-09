package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StreamPlayGroundTest {

    @Test
    void secondHighestNumber() {
        assertThat(StreamPlayGround.secondHighestNumber(
                List.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
        )).isEqualTo(6);

        assertThat(StreamPlayGround.secondHighestNumber(
                List.of()
        )).isEqualTo(0);

        assertThat(StreamPlayGround.secondHighestNumber(
                null
        )).isEqualTo(0);
    }
}