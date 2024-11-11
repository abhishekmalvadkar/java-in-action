package com.amalvadkar.jia.challenges;

import jakarta.annotation.Nonnull;

import java.util.Comparator;
import java.util.List;

record PlayerResult(String name, int rank) implements Comparable<PlayerResult>{
    public static final Comparator<PlayerResult> PLAYER_RESULT_DEFAULT_COMPARATOR = Comparator.comparingInt(PlayerResult::rank)
            .thenComparing(PlayerResult::name);

    /*
        Default sorting should be like
        sort by rank in asc and if two player has same rank then sort them based
        on name
     */

    public int compareTo(@Nonnull PlayerResult obj){
        return  PLAYER_RESULT_DEFAULT_COMPARATOR
                        .compare(this, obj);

    }
}

public class PlayerRank {

    public static final Comparator<PlayerResult> CUSTOM_SORT_COMPARATOR = Comparator.comparing(PlayerResult::rank)
            .reversed()
            .thenComparing(PlayerResult::name);

    public static List<PlayerResult> defaultSort(List<PlayerResult> result){
        return result.stream().sorted().toList();
    }

    /*
        Custom sorting should be like
        sort by rank in desc and if two player has same rank then sort them based
        on name asc
     */
    public static List<PlayerResult> customSort(List<PlayerResult> result){
        return result.stream()
                .sorted(CUSTOM_SORT_COMPARATOR)
                .toList();
    }

}
