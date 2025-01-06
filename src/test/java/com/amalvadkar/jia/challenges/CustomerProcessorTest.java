package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerProcessorTest {

    @Test
    void extractCustomers() {
        var customers = """
                1~abc~1234567892~abc@gmail.com~surat~0976512348791235~24-03-1986~100
                2~cde~1234567893~def@gmail.com~turat~0976512348791236~24-03-1987~101
                3~efg~1234567894~ghe@gmail.com~purat~0976512348791237~24-03-1988~102
                4~jkl~1234567895~lmn@gmail.com~mirat~0976512348791238~24-03-1989~103
                """;
        assertThat(CustomerProcessor.extractCustomers(customers))
                .containsExactly(
                        new Customer(1L,"abc", "1234567892", "abc@gmail.com", "surat", "0976512348791235", LocalDate.of(1986, 3, 24), new BigDecimal("100")),
                        new Customer(2L,"cde", "1234567893", "def@gmail.com", "turat", "0976512348791236", LocalDate.of(1987, 3, 24), new BigDecimal("101")),
                        new Customer(3L,"efg", "1234567894", "ghe@gmail.com", "purat", "0976512348791237", LocalDate.of(1988, 3, 24), new BigDecimal("102")),
                        new Customer(4L,"jkl", "1234567895", "lmn@gmail.com", "mirat", "0976512348791238", LocalDate.of(1989, 3, 24), new BigDecimal("103"))
                );
    }
}