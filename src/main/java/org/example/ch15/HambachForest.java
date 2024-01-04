package org.example.ch15;

public class HambachForest {

    public static void main(String[] args) {
        boolean rweWantsToCutTrees = false;

        Forest hambachForest = new Forest();

        if (rweWantsToCutTrees) {
            Protest<Forest> p1 = new Protest<>();
            p1.believeIn = hambachForest;
        }
    }
}

class Forest { }

class Protest<T> {
    static java.awt.Rectangle MIN_BOUNDARY;
    T believeIn;
    java.time.LocalDate since;
}
