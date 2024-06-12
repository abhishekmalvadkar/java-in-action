package com.amalvadkar.jia.ch1.immutableobjectkata;

public class Ticket {

    private Integer id;
    private String title;

    private Reviewer reviewer;

    public Ticket(Integer id, String title, Reviewer reviewer) {
        this.id = id;
        this.title = title;
        this.reviewer = reviewer;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }
}
