package com.amalvadkar.jia.challenges;

public interface StringProcessor {

    String ANY_NUMBER_OF_SPACE_DELIMETER = "\\s+";

    static int countWord(String content){
        return content.split(ANY_NUMBER_OF_SPACE_DELIMETER).length;
    }

}
