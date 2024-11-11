package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class DeepCloneRunnerTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        User2 userInput = new User2(1, "abc");
        Todo2 todoInput = new Todo2(1, "DSM", LocalDate.of(2024, 11, 7),
                userInput);
        Todo2 clonedTodo = DeepCloneRunner.clone(todoInput);
        assertThat(clonedTodo == todoInput)
                .isFalse();
        assertThat(clonedTodo.id() == todoInput.id())
                .isTrue();
        assertThat(clonedTodo.title() == todoInput.title())
                .isTrue();
        assertThat(clonedTodo.dueDate() == todoInput.dueDate())
                .isTrue();
        assertThat(clonedTodo.createdBy() == todoInput.createdBy())
                .isFalse();
        assertThat(clonedTodo.createdBy().name())
                .isEqualTo(userInput.name());
        assertThat(clonedTodo.createdBy().id())
                .isEqualTo(userInput.id());

    }
}