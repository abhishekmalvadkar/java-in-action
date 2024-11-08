package com.amalvadkar.jia.challenges;

import java.time.LocalDate;

record User(int id, String name){
}
record Todo(int id,String title, LocalDate dueDate, User createdBy) implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCloneRunner {

    public static Todo clone(Todo todo) throws CloneNotSupportedException {
        return (Todo)todo.clone();
    }

}
