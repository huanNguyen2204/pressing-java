package org.example.ch8;

interface Sex {
    default boolean hasPrice() {
        return false;
    }
}

interface Drugs {
    default boolean hasPrice() {
        return true;
    }
}
