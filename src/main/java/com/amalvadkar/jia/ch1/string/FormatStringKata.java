package com.amalvadkar.jia.ch1.string;

import java.text.MessageFormat;

public class FormatStringKata {

    public static String usingStringFormatStaticMethod(String fullNameStr){
        FullName fullName = prepareFullName(fullNameStr);
        return String.format("Hello %s %s",
                fullName.firstname(),
                fullName.lastname().toUpperCase());
        // static method in String class
    }

    public static String usingStringConcatenation(String fullNameStr){
        FullName fullName = prepareFullName(fullNameStr);
        return "Hello " + fullName.firstname() + " (" + fullName.lastname() + ")";
        // BAD in this case because it will create new instance for each concatenation
    }

    public static String usingStringFormattedInstanceMethod(String fullNameStr){
        FullName fullName = prepareFullName(fullNameStr);
        return "Hello %s-%s".formatted(fullName.firstname() ,
                fullName.lastname());
        // instance method in String class
    }

    public static String usingMessageFormatClassFormatStaticMethod(String fullNameStr){
        FullName fullName = prepareFullName(fullNameStr);
        return MessageFormat.format("Hello {0} {1}",
                fullName.firstname().toUpperCase(),
                fullName.lastname());
        // BAD because it's using StringBuffer internally which has synchronized method
    }

    private static FullName prepareFullName(String fullNameStr) {
        String[] fullNameAsSplit = fullNameStr.split(" "); // Tokenization
        String firstname = fullNameAsSplit[0];
        String lastname = fullNameAsSplit[1];
        return new FullName(firstname, lastname);
    }

    private record FullName(String firstname, String lastname) {} // local record class

}
