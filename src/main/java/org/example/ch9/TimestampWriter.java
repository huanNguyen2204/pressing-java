package org.example.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class TimestampWriter {
    public static void writeTimestamp() {
        String content = LocalDateTime.now().toString();

        try {
            Files.writeString(Path.of("timestamps.txt"), content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Path p = Path.of("timestamps.txt");
            Files.writeString(p, LocalDateTime.now() + "\n", StandardOpenOption.APPEND);
            Files.writeString(p, LocalDateTime.now() + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {

        }

//        int number;
//
//        while (true) {
//            try {
//                System.out.println("Please enter number: ");
//                String input = new java.util.Scanner(System.in).nextLine();
//                number = Integer.parseInt(input);
//                break;
//            } catch (NumberFormatException e) {
//                System.err.println("That was not a number!");
//            }
//        }
//
//        System.out.printf("%d is a %s number%n", number, Math.random() > 0.5 ? "wonderful" : "boring");
//        writeTimestamp();
    }
}
