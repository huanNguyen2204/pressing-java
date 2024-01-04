package org.example.ch8;

interface Buyable {
    double price();
}

interface Likeable {
    void act();
}

interface Assertive {
    void act();
}

class Politician implements Likeable, Assertive {
    @Override
    public void act() {}
}
