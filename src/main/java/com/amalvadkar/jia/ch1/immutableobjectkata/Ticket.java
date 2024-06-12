package com.amalvadkar.jia.ch1.immutableobjectkata;

public final class Ticket {

    private final Integer id;
    private final String title;

    private final Reviewer reviewer;

    public Ticket(Integer id, String title, Reviewer reviewer) {
        this.id = id;
        this.title = title;
        this.reviewer = new Reviewer(reviewer);
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Reviewer getReviewer() {
        return new Reviewer(this.reviewer);
    }
}
