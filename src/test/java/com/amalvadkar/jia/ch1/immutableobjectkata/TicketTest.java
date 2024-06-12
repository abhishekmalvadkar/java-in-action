package com.amalvadkar.jia.ch1.immutableobjectkata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicketTest {

    @Test
    void should_not_able_to_mutate_ticket_class_object_once_created() {
        Reviewer reviewer = new Reviewer("Abhi");
        Ticket ticket = new Ticket(1, "Issue with login", reviewer);
        reviewer.setName("xyz");
        assertThat(ticket.getReviewer().getName()).isEqualTo("Abhi");
    }

}