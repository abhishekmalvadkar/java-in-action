package com.amalvadkar.jia.ch1.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FormatStringKataTest {

    @Test
    void should_return_formatted_string() {
        assertThat(FormatStringKata.usingStringFormatStaticMethod("Abhi Malvadkar"))
                .isEqualTo("Hello Abhi MALVADKAR");

        assertThat(FormatStringKata.usingStringConcatenation("Abhi Malvadkar"))
                .isEqualTo("Hello Abhi (Malvadkar)");

        assertThat(FormatStringKata.usingStringFormattedInstanceMethod("Abhi Malvadkar"))
                .isEqualTo("Hello Abhi-Malvadkar");

        assertThat(FormatStringKata.usingMessageFormatClassFormatStaticMethod("Abhi Malvadkar"))
                .isEqualTo("Hello ABHI Malvadkar");
    }

}