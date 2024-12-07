package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterKataTest {

    @Test
    void checkChar(){
        assertThat(CharacterKata.checkChar('a'))
                .isEqualTo("alphabet");

        assertThat(CharacterKata.checkChar('F'))
                .isEqualTo("alphabet");

        assertThat(CharacterKata.checkChar('5'))
                .isEqualTo("number");

        assertThat(CharacterKata.checkChar('9'))
                .isEqualTo("number");

        assertThat(CharacterKata.checkChar('('))
                .isEqualTo("other symbol");
    }

}