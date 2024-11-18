package com.amalvadkar.jia.challenges;

/*
    Write a program that asks the user to enter a number of seconds.

•  There are 60 seconds in a minute.
    If the number of seconds entered by the user is greater than or equal to 60,
    the program should display the number of minutes in that many seconds.

•  There are 3,600 seconds in an hour.
    If the number of seconds entered by the user is greater than or equal to 3,600,
    the program should display the number of hours in that many seconds.

•  There are 86,400 seconds in a day.
   If the number of seconds entered by the user is greater than or equal to 86,400,
    the program should display the number of days in that many seconds.

    Ex :
    i/p => 120 => 2 minute

    60 sec => 1 min
    120 sec => 120/60 = 2 min

    3600 sec => 1 hour
    7200 sec => 7200/3600 => 2 hour

    86400 sec => 1 day
    172800 sec => 172800/86400 =>  2 day
 */

public class TimeCalculator {

    public static final double NO_OF_SECONDS_IN_MINUTE = 60.0;
    public static final double NO_OF_SECONDS_IN_HOUR = 3600.0;
    public static final double NO_OF_SECONDS_IN_DAY = 86400.0;

    public static String calculate(long noOfSeconds){
        if (isMoreThenOrEqualToDaySeconds(noOfSeconds)){
            double day = noOfSeconds / NO_OF_SECONDS_IN_DAY;
            return String.format("%.2f day(s)", day);
        }
        if (isMoreThenOrEqualToHourSeconds(noOfSeconds)){
            double hour = noOfSeconds / NO_OF_SECONDS_IN_HOUR;
            return String.format("%.2f hour(s)", hour);
        }
        if (isMoreThenOrEqualToMinuuteSeconds(noOfSeconds)){
            double minute = noOfSeconds / NO_OF_SECONDS_IN_MINUTE;
            return String.format("%.2f minute(s)", minute);
        }
        return String.format("%d second(s)", noOfSeconds);
    }

    private static boolean isMoreThenOrEqualToMinuuteSeconds(long noOfSeconds) {
        return noOfSeconds >= NO_OF_SECONDS_IN_MINUTE;
    }

    private static boolean isMoreThenOrEqualToHourSeconds(long noOfSeconds) {
        return noOfSeconds >= NO_OF_SECONDS_IN_HOUR;
    }

    private static boolean isMoreThenOrEqualToDaySeconds(long noOfSeconds) {
        return noOfSeconds >= NO_OF_SECONDS_IN_DAY;
    }

}
