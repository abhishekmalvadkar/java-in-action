package com.amalvadkar.jia.ch1.immutableobjectkata;

public class Reviewer {

    private Integer id;

    private String name;

    public Reviewer(Integer id , String name) {
        this.id = id;
        this.name = name;
    }

    public Reviewer(Reviewer reviewer) {
        this.id = reviewer.getId();
        this.name = reviewer.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
