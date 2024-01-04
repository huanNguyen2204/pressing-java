package org.example.ch12;

public class GenericMethods {
    public static <T> T random(T m, T n) {
        return Math.random() > 0.5 ? m : n;
    }

    public static void main(String[] args) {
        String s = random("Something", "Anything");
        System.out.println(s);
    }
}
