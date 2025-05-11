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

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null)
//            return false;
//
//        if (this == obj)
//            return true;
//        // Pattern matching with instanceof
//        if(obj instanceof Task task){
//            return Objects.equals(this.id, task.id) &&
//                   (Objects.equals(this.title, task.title) &&
//                    Objects.equals(this.status, task.status));
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
               Objects.equals(title, task.title) &&
               Objects.equals(dueDate, task.dueDate) &&
               Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, dueDate, status);
    }
}
public class EqualsKata {

    public static boolean run(Object first, Object second){
//        return first.equals(second); // not null safe
        return Objects.equals(first, second);
    }

}


