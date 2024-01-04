package org.example.ch8;

import java.util.Arrays;

public class SortableDemo {
    public static void main(String[] args) {
        RandomValues r = new RandomValues();

        System.out.println(Arrays.toString(r.getValues()));
        r.sort();
        System.out.println(Arrays.toString(r.getValues()));
    }
}
