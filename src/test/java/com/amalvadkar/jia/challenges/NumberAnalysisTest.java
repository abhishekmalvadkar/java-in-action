package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberAnalysisTest {

    @Test
    void generateReport() {
        assertThat(NumberAnalysis.generateReport("numbers.txt"))
                .isEqualTo("""
                        lowest is 10
                        highest is 76
                        sum is 143
                        average is 35.75
                        """);
    }
}