package com.amalvadkar.jia.challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamPlayGround {

    public static int secondHighestNumber(List<Integer> numbers){
        Comparator<Integer> intNaturalSortingComparator =
                Comparator.comparing(Function.identity());
        Comparator<Integer> intDescindingOrderComparator =
                intNaturalSortingComparator.reversed();
        return collectionStream(numbers)
                .sorted(intDescindingOrderComparator)
                .skip(1)
                .limit(1)
                .findFirst()
                .orElse(0);
    }

    public static <T> Stream<T> collectionStream(List<T> list){
        return Objects.isNull(list) ? Stream.of() : list.stream();
    }

}
