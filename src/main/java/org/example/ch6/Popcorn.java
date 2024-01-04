package org.example.ch6;

import java.util.Scanner;

public class Popcorn {
    public final static int CALORIES;

    static {
        try (Scanner scanner = new Scanner(Popcorn.class.getResourceAsStream("/calories.txt"))) {
            CALORIES = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.printf("%d cal", CALORIES);
    }
}
