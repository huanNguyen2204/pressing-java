package org.example.ch12;

public class Bounds {
    public static <T extends CharSequence> T random(T m, T n) {
        return Math.random() > 0.5 ? m : n;
    }

    public static void main(String[] args) {
        String random1 = random("Shi", "Kar");
        System.out.println(random1);

        CharSequence random2 = random("Ushi", new StringBuilder("Taka"));
        System.out.println(random2);
    }
}
