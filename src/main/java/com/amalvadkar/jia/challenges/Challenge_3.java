package com.amalvadkar.jia.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge_3 {

    /*
        Suppose you are getting some values from import csv file for task
        1) Title : String - amx length = 50
        2) Priority : String - Possible values P0, P1, P2, P3
        3) Story Point : String - Should contain only integer value
        4) Due Date : String - Should have in dd/MM/YYYY format

        all these values will come as string if any criteria failed then you have to show list
        error messages like below to user who has imported this tasks csv file

        -> Title should not have more than 50 character
        -> Incorrect priority
        -> Incorrect story point
        -> Incorrect due date
     */

    public static List<String> run(TaskCsvDTO taskCsvDTO){
        List<String> errorMessages = new ArrayList<>();

        if (taskCsvDTO.title().length() > 50){
            errorMessages.add("Title should not have more than 50 character");
        }

        /*if (!List.of("P0", "P1", "P3", "P4").contains(taskCsvDTO.priority())){
            errorMessages.add("Incorrect priority");
        }*/

        Pattern validPriorityPattern = Pattern.compile("(P0|P1|P2|P3|P4)");
        Matcher validPropertyMatcher = validPriorityPattern.matcher(taskCsvDTO.priority());
        if (!validPropertyMatcher.matches()){
            errorMessages.add("Incorrect priority");
        }

        Pattern numberOnly = Pattern.compile("\\d");
        Matcher numberOnlyMatcher = numberOnly.matcher(taskCsvDTO.storyPoint());
        if (!numberOnlyMatcher.matches()){
            errorMessages.add("Incorrect story point");
        }

        Pattern dueDatePattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher dueDateMatcher = dueDatePattern.matcher(taskCsvDTO.dueDate());
        if (!dueDateMatcher.matches()){
            errorMessages.add("Incorrect due date");
        }

        return errorMessages;
    }


}
record TaskCsvDTO(String title, String priority, String storyPoint, String dueDate){}

/*
    Learning points
    1) As you can see that, this is the case where validation is required then your regex
       skills will come into the picture
    2) You can keep these regex in the database table so you can control them
       externally
 */
