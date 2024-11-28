package com.amalvadkar.jia.challenges.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/*
    You are building a contact management app.
    Write a program to sort a list of names alphabetically.
    Ensure the sorting is case-insensitive.

    Input: ["Charlie","Alice", "david", "bob"]
    Output: ["Alice", "bob", "Charlie", "david"]
 */
public class SortNames {

    private static final Comparator<String> NAME_CASE_INCENSITIVE_ORDER_ASC_COMPARATOR = Comparator.comparing(
            Function.identity(),
            String.CASE_INSENSITIVE_ORDER
    );
    private static final Comparator<String> NAME_CASE_INCENSTITIVE_ORDER_DESC_COMPARATOR =
            NAME_CASE_INCENSITIVE_ORDER_ASC_COMPARATOR.reversed();
    private static final String SORT_ORDER_DESC = "desc";

    public static List<String> sort(String sortOrder, String... names){
        if (SORT_ORDER_DESC.equals(sortOrder)) {
            return prepareSortedNames(names, NAME_CASE_INCENSTITIVE_ORDER_DESC_COMPARATOR);
        } else {
            return prepareSortedNames(names, NAME_CASE_INCENSITIVE_ORDER_ASC_COMPARATOR);
        }
    }

    private static List<String> prepareSortedNames(String[] names, Comparator<String> comparator) {
        return Arrays.stream(names)
                .sorted(comparator)
                .toList();
    }

}

/*

    Learning point :

    Ensuring case-insensitive sorting means treating uppercase and lowercase
    letters equally while sorting. In alphabetical order,
    it doesn't matter if a name starts with a capital or small letter;
    all names should be sorted based on their alphabetical position without
     considering their case.

    Example
    Input List:
    ["Alice", "bob", "Charlie", "david"]

    Case-Sensitive Sorting (Incorrect for this requirement):
    When sorting is case-sensitive, uppercase letters are prioritized over
    lowercase letters in ASCII order, leading to this result:
    ["Alice", "Charlie", "bob", "david"]

    Case-Insensitive Sorting (Required):
    When sorting is case-insensitive, "bob" and "Charlie" are treated equally
    regardless of their cases, resulting in:
    ["Alice", "bob", "Charlie", "david"]

    Note :

    -> Pay attention of case ineffectiveness while sorting string because by default
       natural sorting is not providing is not giving it
 */
