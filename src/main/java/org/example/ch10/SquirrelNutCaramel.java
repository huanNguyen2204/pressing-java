package org.example.ch10;

public class SquirrelNutCaramel {
    static String name = "Squirrel Nut Caramel";
    int invented = 1890;

    static class Peanut {
        void print() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Peanut peanut = new Peanut();
        peanut.print();
    }
}
