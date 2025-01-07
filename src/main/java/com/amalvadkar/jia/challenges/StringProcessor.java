package com.amalvadkar.jia.challenges;

import java.util.regex.Pattern;

public interface StringProcessor {

    String ANY_NUMBER_OF_SPACE_DELIMETER = "\\s+";

    static int countWord(String content){
        // Approach 1 - screaming that we need regex
       return Pattern.compile(ANY_NUMBER_OF_SPACE_DELIMETER)
                .split(content).length;

        // Approach 2 - Not screaming that we need regex so developer can do mistake by passing just literal which can be understandable in different wat (e.g .(dot means any character))
        // return content.split(ANY_NUMBER_OF_SPACE_DELIMETER).length;
    }

}
