package com.amalvadkar.jia.challenges;

public class PersonalInformation {

    /*
         Personal information

        Write a program that displays the following information, each on a separate line:
        •  Your name
        •  Your address, with city, state, and ZIP
        •  Your telephone number
        Although these items should be displayed on separate output lines, use only a single println statement in your program.
     */

    public static void main(String[] args) {
        String name = "abhi";
        String address = "my address";
        String city = "my city";
        String state = "my state";
        String zip = "my zip";
        String telephoneNo = "123";
        System.out.printf("""
                %s
                %s
                %s
                %s
                %s
                %s
                """, name, address, city, state, zip, telephoneNo);
//        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s", name, address, city, state, zip, telephoneNo);
    }

}
