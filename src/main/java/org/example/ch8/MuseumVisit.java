package org.example.ch8;

import org.example.ch7.Event;

public class MuseumVisit extends Event implements Buyable {
    int price;

    public MuseumVisit(int price) {
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }
}
