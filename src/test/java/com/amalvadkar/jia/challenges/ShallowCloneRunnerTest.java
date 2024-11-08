package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class ShallowCloneRunnerTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        User userInput = new User(1, "abc");
        Todo todoInput = new Todo(1, "DSM", LocalDate.of(2024, 11, 7),
                userInput);
        Todo clonedTodo = ShallowCloneRunner.clone(todoInput);
        assertThat(clonedTodo == todoInput)
                .isFalse();
        assertThat(clonedTodo.id() == todoInput.id())
                .isTrue();
        assertThat(clonedTodo.title() == todoInput.title())
                .isTrue();
        assertThat(clonedTodo.dueDate() == todoInput.dueDate())
                .isTrue();
        assertThat(clonedTodo.createdBy() == todoInput.createdBy())
                .isTrue();

    }
}