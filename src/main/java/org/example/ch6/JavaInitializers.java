package org.example.ch6;

public class JavaInitializers {
    static {
        System.out.println("Static initializer");
    }

    {
        System.out.println("instance initializer");
    }

    JavaInitializers() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new JavaInitializers();
        new JavaInitializers();
    }
}
