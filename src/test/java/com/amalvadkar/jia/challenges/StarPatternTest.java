package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StarPatternTest {

    @Test
    void starPattern() {
        assertThat(StarPattern.starPattern())
                .isEqualTo(
                        """
                                   *
                                  ***
                                 *****
                                *******
                                 *****
                                  ***
                                   *                      
                                """
                );
    }
}