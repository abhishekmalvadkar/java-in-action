package com.amalvadkar.jia.ch1.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerFileNameValidator {

    public static boolean isValid(String filename){
        // HDFC_02.10.2024.csv
        String regex = "[a-zA-Z]+_\\d{2}.\\d{2}.\\d{4}.csv";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(filename);
        return matcher.matches();
    }
}
