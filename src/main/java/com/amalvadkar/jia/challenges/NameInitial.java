package com.amalvadkar.jia.challenges;

public class NameInitial {

    /*
        Name and initials for avatar icon creation

        Return Initials of name, so you can use them to create user avatar icon creation
     */
    public static String run(String firstname, String lastname){
        return String.valueOf(firstname.charAt(0)) + lastname.charAt(0);
    }
}
