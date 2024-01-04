package org.example.ch19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Chapter19 {

    public static void main(String[] args) {
        Path picturePath = Paths.get(System.getProperty("user.home"))
            .resolve("Pictures")
            .resolve("Squid game");

        System.out.println(picturePath);
    }
}
