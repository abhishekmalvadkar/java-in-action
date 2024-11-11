package com.amalvadkar.jia.challenges;

import java.time.LocalDate;

record User2(int id, String name){
}
record Todo2(int id,String title, LocalDate dueDate, User2 createdBy) implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        if (this instanceof Cloneable){
            return new Todo2(id, title,dueDate, new User2(createdBy().id(), createdBy().name()));
        }
        throw new CloneNotSupportedException("Todo2 should be cloneable");
    }
}

public class DeepCloneRunner {

    public static Todo2 clone(Todo2 todo) throws CloneNotSupportedException {
        return (Todo2)todo.clone();
    }

}

/*
    Learning points :
    -> Here I have implemented my custom deep cloning things
    -> id will be take as value, no on can change it
    -> title string is immutable
    -> LocalDate due date is immutable
    -> That's why I didn't created new obj for them
    -> User2 is mutable that's why I have created new obj for it while cloning
 */
