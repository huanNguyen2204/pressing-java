package org.example.ch11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorThenComparingDemo {
    record Candy(int calories, String name) {
        @Override
        public String toString() {
            return name + "/" + calories;
        }
    }

    static final Comparator<Candy> CANDY_CALORIES_COMPARATOR =
        new Comparator<Candy>() {
            @Override
            public int compare(Candy c1, Candy c2) {
                return Integer.compare(c1.calories(), c2.calories());
            }
        };

    static final Comparator<Candy> CANDY_NAME_COMPARATOR =
        new Comparator<Candy>() {
            @Override
            public int compare(Candy p1, Candy p2) {
                return p1.name.compareTo(p2.name());
            }
        };

    public static void main(String[] args) {
        List<Candy> candies = Arrays.asList(
            new Candy(230, "Special Dark Chocolate"),
            new Candy(230, "Mil Chocolate Bar"),
            new Candy(60, "Tooties Pop"),
            new Candy(280, "Snickers Bar")
        );

        candies.sort(CANDY_CALORIES_COMPARATOR);
        System.out.println(candies);

        candies.sort(CANDY_NAME_COMPARATOR);
        System.out.println(candies);

        candies.sort(CANDY_CALORIES_COMPARATOR.thenComparing(CANDY_NAME_COMPARATOR));
        System.out.println(candies);
    }
}
