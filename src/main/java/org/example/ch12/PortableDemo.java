package org.example.ch12;

import java.util.Arrays;

public class PortableDemo {

    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setWeight(10);
        Cup cup = new Cup();
        cup.setWeight(100);

        System.out.println(PortableUtils.areLighterThan(Arrays.asList(pen, cup), 10));
        System.out.println(PortableUtils.areLighterThan(Arrays.asList(pen, cup), 120));
    }
}
