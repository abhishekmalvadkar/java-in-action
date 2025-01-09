package com.amalvadkar.jia.challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamPlayGround {

    public static int secondHighestNumber(List<Integer> numbers){
        return collectionStream(numbers)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst()
                .orElse(0);
    }

    public static <T> Stream<T> collectionStream(List<T> list){
        return Objects.isNull(list) ? Stream.of() : list.stream();
    }

}
