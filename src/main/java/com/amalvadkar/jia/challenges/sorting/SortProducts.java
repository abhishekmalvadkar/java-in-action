package com.amalvadkar.jia.challenges.sorting;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

/*
    You are developing an e-commerce platform.
    Sort a list of products by their price in ascending order.
 */
public class SortProducts {

    public static List<Product> byPriceAsc(List<Product> products){
        return products.stream()
                .sorted(Comparator.comparing(Product::price))
                .toList();
    }

}

record Product(String name , BigDecimal price)
//        implements Comparable<Product>
{
//    public int compareTo(Product obj){
//        return this.price.compareTo(obj.price);
//    }
}

/*
    Learning point :

    I don't like to give natural sorting order in class
    itself using Comparable interface implements

    I like to give on the fly comparator using
    Comparator.comparing(..) method
 */
