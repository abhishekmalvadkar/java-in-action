package com.amalvadkar.jia.challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamPlayGround {

    public static int secondHighestNumber(List<Integer> numbers){
        return collectionStream(numbers)
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if (o1 > o2){
                            return - 1;
                        }
                        if (o1 < o2){
                            return 1;
                        }
                        return 0;
                    }
                })
                .skip(1)
                .limit(1)
                .findFirst()
                .orElse(0);
    }

    public static <T> Stream<T> collectionStream(List<T> list){
        return Objects.isNull(list) ? Stream.of() : list.stream();
    }

}
