package org.example.ch7;

public class ToStringFromSuper {
    public ToStringFromSuper() {
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "(._.)";
    }

    public static void main(String[] args) {
        new ToStringFromSuper();
    }
}
