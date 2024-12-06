package com.amalvadkar.jia.challenges;

/*
    Output :
    Hi
    Hello
    Bye

    Note : You have to use only on System.out.println()
 */
public class MultiLineDisplayKata {

    public static void main(String[] args) {

        // Before JDK 14 - Approach 1
        System.out.print("Hi\nHello\nBye");

        // Before JDK 14 - Approach 2
        System.out.print("Hi\n" +
                           "Hello\n" +
                           "Bye");

        // Before JDK 14 - Approach 3
        // After JDK 14 - text block
        System.out.print("""
                Hi
                Hello
                Bye"""); // if I take this triple quotes in new line then it will add one new line which I don't want

    }

}
