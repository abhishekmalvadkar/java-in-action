package com.amalvadkar.jia.challenges;

import java.time.LocalDate;
import java.util.Objects;

final class Task {
    private final Long id;
    private final String title;
    private final LocalDate dueDate;
    private final String status;

    Task(Long id, String title, LocalDate dueDate, String status) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Long id() {
        return id;
    }

    public String title() {
        return title;
    }

    public LocalDate dueDate() {
        return dueDate;
    }

    public String status() {
        return status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }

        if (this == obj){
            return true;
        }

        if (obj instanceof Task task){
//            return this.id.equals(task.id) &&
//                   this.title.equals(task.title) &&
//                   this.dueDate.equals(task.dueDate) &&
//                   this.status.equals(task.status); DON'T do this because if any variable from this is null then ready for NPE
            return Objects.equals(this.id, task.id) &&
                   Objects.equals(this.title, task.title) &&
                   Objects.equals(this.dueDate, task.dueDate) &&
                   Objects.equals(this.status, task.status);
        }
        return false;
    }
}
public class EqualsKata {

    public static boolean run(Object first, Object second){
//        return first.equals(second); DON'T do this because if first is null then ready for NPE
        return Objects.equals(first, second);
    }

}

/*
    Learning point :

    -> Always use Objects.equals(first, second) over direct equals() method
       otherwise ready for NPE in some day.
    -> Whenever see direct equal() method then take step back and
       replace it with Objects.equals(first, second) method
 */
