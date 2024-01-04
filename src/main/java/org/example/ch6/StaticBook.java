package org.example.ch6;

public class StaticBook {
    static {
        System.out.println("Two fish are in a tank.");
    }

    public static void main(String[] args) {
        System.out.println("How do you drive this thing?");
    }

    static {
        System.out.println("One says");
    }
}
