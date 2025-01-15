package com.amalvadkar.jia.exercise;

public class ExamResult {

    public static final int PASSING_MARKS_THRESHOLD = 50;

    public static boolean isPaas(int marks){
        return marks > PASSING_MARKS_THRESHOLD;
    }

}
