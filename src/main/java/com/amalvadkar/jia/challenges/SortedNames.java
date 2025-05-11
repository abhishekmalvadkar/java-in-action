package com.amalvadkar.jia.challenges;

import java.util.Arrays;
import java.util.List;

/*
    Write a program that asks the user to enter three names, and then displays
    the names sorted in ascending order. For example,
    if the user entered “Charlie”, “Leslie”, and “Andy”, the program would display:

    Andy
    Charlie
    Leslie
 */
public class SortedNames {

    public static List<String> sortAsc(String... names){
        return Arrays.stream(names)
                .sorted()
                .toList();
    }

}
