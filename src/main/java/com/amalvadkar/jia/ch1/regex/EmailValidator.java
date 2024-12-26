package com.amalvadkar.jia.ch1.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Email Validation
    Problem: Write a regex to validate email addresses.
    The email should be in the format: username@domain.com, where:

    The username can contain letters, digits, dots, underscores, and hyphens.
    The domain name can contain letters, digits, hyphens, and a period (to separate subdomains).
    The top-level domain (TLD) must be between 2 and 6 characters long (e.g., .com, .org, etc.).
 */
public class EmailValidator {

    public static final Pattern VALID_EMAIL_REGEX_PATTERN =
            Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");

    public static boolean isValid(String email){
        Matcher matcher = VALID_EMAIL_REGEX_PATTERN.matcher(email);
        return matcher.matches();
    }

}
