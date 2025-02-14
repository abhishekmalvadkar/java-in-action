package com.amalvadkar.jia.challenges;

import java.time.Duration;

public class ELearning {

    public static final String SPACE = " ";
    public static final String HOUR_SHORT_FORM = "h";
    public static final String MINUTES_SHORT_FORM = "m";

    public static String prepareCourseDurationText(int totalMinutes){
        Duration duration = Duration.ofMinutes(totalMinutes);
        return prepareCourseDurationText(duration);
    }

    private static String prepareCourseDurationText(Duration duration) {
        StringBuilder courseDurationBuilder = new StringBuilder();
        if (hasHour(duration)){
            courseDurationBuilder.append(duration.toHoursPart())
                    .append(HOUR_SHORT_FORM);
        }
        if (hasMinutes(duration)){
            courseDurationBuilder.append(SPACE).append(duration.toMinutesPart())
                    .append(MINUTES_SHORT_FORM);
        }
        return courseDurationBuilder.toString().trim();
    }

    private static boolean hasMinutes(Duration duration) {
        return duration.toMinutesPart() > 0;
    }

    private static boolean hasHour(Duration duration) {
        return duration.toHoursPart() > 0;
    }

}
