package com.amalvadkar.jia.ch1.immutableobjectkata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicketTest {

    @Test
    void should_not_able_to_mutate_ticket_class_object_by_using_passed_object_reference_once_created() {
        Reviewer reviewer = new Reviewer(1, "Abhi");

        Ticket ticket = new Ticket(1, "Issue with login", reviewer);

        reviewer.setName("xyz");
        reviewer.setId(5);

        assertThat(ticket.getReviewer().getName()).isEqualTo("Abhi");
        assertThat(ticket.getReviewer().getId()).isEqualTo(1);
    }

    @Test
    void should_not_able_to_mutate_ticket_class_object_by_using_getter_method_once_created() {
        Reviewer reviewer = new Reviewer(1, "Abhi");

        Ticket ticket = new Ticket(1, "Issue with login", reviewer);

        Reviewer reviewerFromTicketObject = ticket.getReviewer();
        reviewerFromTicketObject.setId(5);
        reviewerFromTicketObject.setName("xyz");

        assertThat(ticket.getReviewer().getName()).isEqualTo("Abhi");
        assertThat(ticket.getReviewer().getId()).isEqualTo(1);
    }

//    @Test
//    void should_not_able_to_mutate_ticket_class_object_by_child_class_once_created() {
//        Reviewer reviewer = new Reviewer(1, "Abhi");
//
//        Ticket ticket = new InfraTicket(1, "Issue with login", reviewer);
//
//        assertThat(ticket.getReviewer().getName()).isEqualTo("Abhi");
//        assertThat(ticket.getReviewer().getId()).isEqualTo(1);
//    }

}