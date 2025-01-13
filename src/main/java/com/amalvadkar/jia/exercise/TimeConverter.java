package com.amalvadkar.jia.exercise;

public class TimeConverter {

    public static final int MINUTES_IN_ONE_HOUR = 60;
    public static final int HOURS_IN_ONE_DAY = 24;

    public static int convertHoursToMinutes(int hours){
        /*
            1 h -> 60 minutes
            2 h -> 60 * 2 minutes
            N h -> 60 * N minutes
         */
        if (hours < 0) return -1;

        return hours * MINUTES_IN_ONE_HOUR;
    }

    public static int convertDaysToMinutes(int days){
         /*
            1 day -> 24 hours
            1 hour -> 60 minutes
            24 hours -> 24 * 60 minutes
         */
        if (days < 0) return -1;

        int hoursInInputDay = days * HOURS_IN_ONE_DAY;
        return hoursInInputDay * MINUTES_IN_ONE_HOUR;
    }

}
