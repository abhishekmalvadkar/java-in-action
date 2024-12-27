package com.amalvadkar.jia.ch1.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Valid Phone Numbers:

    (555) 123-4567
    (800) 555-1234
    (123) 456-7890

    Invalid Phone Numbers:

    555-123-4567 (missing parentheses)
    (555) 123-45678 (too many digits in the second part)
    123-456-7890 (missing parentheses around area code)
    (555) abc-1234 (contains letters)
 */
public class PhoneNumberValidator {

    public static final Pattern VALID_PHONE_NO_REGEX_PATTERN =
            Pattern.compile("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}");

    public static boolean isValid(String email){
        Matcher matcher = VALID_PHONE_NO_REGEX_PATTERN.matcher(email);
        return matcher.matches();
    }
}
