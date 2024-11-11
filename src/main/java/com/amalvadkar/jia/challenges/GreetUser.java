package com.amalvadkar.jia.challenges;

public class GreetUser {
    
    
    public static String greetPage(String username){
//        return "<html>\n" +
//               " <head><title>Welcome</title></head>\n" +
//               " <body>\n" +
//               " <h1>Hello, $user$!</h1>\n" +
//               " <hr>\n" +
//               " <p>Welcome to our web-site</p>\n" +
//               " </body>\n" +
//               "</html>\n".replace("$user$", username); // This will make test fail why check below section 1 explanation

//            // Approach 1 to fix is use parenthesis () around + whole string so it will done before replace() methid
//            // if you are using before jdk 14
//                return ("<html>\n" +
//               " <head><title>Welcome</title></head>\n" +
//               " <body>\n" +
//               " <h1>Hello, $user$!</h1>\n" +
//               " <hr>\n" +
//               " <p>Welcome to our web-site</p>\n" +
//               " </body>\n" +
//               "</html>\n").replace("$user$", username);

        // Approach 2 if you are using JDk 14 OR LATER than use text block
        return """
                <html>
                 <head><title>Welcome</title></head>
                 <body>
                 <h1>Hello, $user$!</h1>
                 <hr>
                 <p>Welcome to our web-site</p>
                 </body>
                </html>
                """.replace("$user$", username);
    }
    
    
}

/*
    section 1 :
    Before Java 15 introduced text blocks, it was common to represent long
    multiline string literals as a concatenation, like this:

    There’s nothing wrong with this approach if you cannot upgrade to Java 15 or
    newer. The care should be taken if you want to process the whole
    concatenation somehow. For example, imagine that you want to perform
    replacement of $user$ placeholder right here. It’s quite easy to make the
    following mistake:

    It might not be evident at the first glance, but the replacement is applied to
    the last string segment </html>\n only. As a result, the replace() call does
    nothing and the placeholder is not substituted. This will not result in a
    compilation error nor a runtime exception but a user will see the $user$
    placeholder instead of the correct user name.

    Static analysis

    Pay attention to static analysis warnings. IntelliJ IDEA has “Replacement
    operation has no effect” inspection, which can sometimes detect if string
    replace operation does nothing. This can help to detect some of bugs like this.

    Ways to avoid this mistake:

    -> Don’t forget that string concatenation has lower precedence than a
        method call. Always wrap method call qualifier into parentheses, unless
        it’s array element access, another method call, or a new expression.
        Avoid calls on complex qualifiers. Extract a complex qualifier to a
        separate variable whenever possible.
    -> Update to Java 15 or newer and use text blocks instead of string
        concatenation when possible. In this case, such a mistake would not be
        possible:


 */
