package com.amalvadkar.jia.exercise;

public class Dimension {

    private static final int ONE_FEET_INCHES_VALUE = 12;
    private final int feet;
    private final int inches;

    public Dimension(int inches) {
        /*
            12 feet -> 1 inches
            24 feet -> 24/12 = 2 inches
         */
        this.inches = inches;
        this.feet = inches / ONE_FEET_INCHES_VALUE;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }
}
