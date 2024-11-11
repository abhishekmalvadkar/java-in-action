package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerRankTest {

    @Test
    void defaultSort() {
        List<PlayerResult> playerResults = List.of(
                new PlayerResult("Abhi", 2),
                new PlayerResult("Babu", 1),
                new PlayerResult("Tabu", 1),
                new PlayerResult("Chabu", 3)
        );
        assertThat(PlayerRank.defaultSort(playerResults))
                .containsExactly(
                        new PlayerResult("Babu", 1),
                        new PlayerResult("Tabu", 1),
                        new PlayerResult("Abhi", 2),
                        new PlayerResult("Chabu", 3)
                );
    }

    @Test
    void customSort() {
        List<PlayerResult> playerResults = List.of(
                new PlayerResult("Abhi", 2),
                new PlayerResult("Babu", 1),
                new PlayerResult("Tabu", 1),
                new PlayerResult("Chabu", 3)
        );
        assertThat(PlayerRank.customSort(playerResults))
                .containsExactly(
                        new PlayerResult("Chabu", 3),
                        new PlayerResult("Abhi", 2),
                        new PlayerResult("Babu", 1),
                        new PlayerResult("Tabu", 1)
                );
    }
}