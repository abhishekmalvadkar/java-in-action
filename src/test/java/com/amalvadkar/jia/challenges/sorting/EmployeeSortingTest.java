package com.amalvadkar.jia.challenges.sorting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeSortingTest {

    @Test
    void sort() {

        // Test Case 1 (Same Age, Different Salary, and Names)
        assertThat(EmployeeSorting.sort(
                List.of(
                        new Employee("Charlie", 25, new BigDecimal("70000")),
                        new Employee("Alice", 25, new BigDecimal("70000")),
                        new Employee("Bob", 25, new BigDecimal("80000"))
                )
        )).containsExactly(
                new Employee("Bob", 25, new BigDecimal("80000")),
                new Employee("Alice", 25, new BigDecimal("70000")),
                new Employee("Charlie", 25, new BigDecimal("70000"))
        );

        // Test Case 2 (Edge Case: Same Name, Age, and Salary)
        assertThat(EmployeeSorting.sort(
                List.of(
                        new Employee("Alice", 30, new BigDecimal("70000")),
                        new Employee("Alice", 30, new BigDecimal("70000")),
                        new Employee("Bob", 25, new BigDecimal("60000"))
                )
        )).containsExactly(
                new Employee("Bob", 25, new BigDecimal("60000")),
                new Employee("Alice", 30, new BigDecimal("70000")),
                new Employee("Alice", 30, new BigDecimal("70000"))
        );


        assertThat(EmployeeSorting.sort(
                List.of(
                        new Employee("Alice", 30, new BigDecimal("70000")),
                        new Employee("Bob", 25, new BigDecimal("80000")),
                        new Employee("Charlie", 25, new BigDecimal("60000")),
                        new Employee("David", 30, new BigDecimal("70000")),
                        new Employee("Eve", 30, new BigDecimal("70000"))
                )
        )).containsExactly(
                new Employee("Bob", 25, new BigDecimal("80000")),
                        new Employee("Charlie", 25, new BigDecimal("60000")),
                        new Employee("Alice", 30, new BigDecimal("70000")),
                        new Employee("David", 30, new BigDecimal("70000")),
                        new Employee("Eve", 30, new BigDecimal("70000"))
        );

        assertThat(EmployeeSorting.sort(
                List.of(
                        new Employee("Alice", 40, new BigDecimal("100000")),
                        new Employee("Bob", 25, new BigDecimal("150000")),
                        new Employee("Charlie", 25, new BigDecimal("50000")),
                        new Employee("David", 30, new BigDecimal("120000")),
                        new Employee("Eve", 35, new BigDecimal("110000"))
                )
        )).containsExactly(
                new Employee("Bob", 25, new BigDecimal("150000")),
                new Employee("Charlie", 25, new BigDecimal("50000")),
                new Employee("David", 30, new BigDecimal("120000")),
                new Employee("Eve", 35, new BigDecimal("110000")),
                new Employee("Alice", 40, new BigDecimal("100000"))
        );

        // Test Case  (Case-Sensitive Names)
        assertThat(EmployeeSorting.sort(
                List.of(
                        new Employee("alice", 30, new BigDecimal("70000")),
                        new Employee("Bob", 25, new BigDecimal("60000")),
                        new Employee("ALICE", 30, new BigDecimal("70000"))
                )
        )).containsExactly(
                new Employee("Bob", 25, new BigDecimal("60000")),
                new Employee("ALICE", 30, new BigDecimal("70000")),
                new Employee("alice", 30, new BigDecimal("70000"))
        );



    }
}