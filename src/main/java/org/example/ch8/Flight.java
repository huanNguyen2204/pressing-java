package org.example.ch8;

import org.example.ch7.Event;

public class Flight extends Event implements Buyable, Comparable<Flight> {
    final double ticketPrice;

    public Flight(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public int compareTo(Flight other) {
        return Double.compare(ticketPrice, other.ticketPrice);
    }

    @Override
    public double price() {
        return ticketPrice;
    }
}
