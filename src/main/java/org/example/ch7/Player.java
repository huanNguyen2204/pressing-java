package org.example.ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Player {
    private City location;
    ArrayList<Candy> candies = new ArrayList<Candy>();

    public void buy(Candy newCandy) {
        candies.add(Objects.requireNonNull(newCandy));
    }

    public boolean eat(String name) {
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).name.equals(name)) {
                candies.remove(i);
            }
            return true;
        }
        return false;
    }

    public void listCandies() {
        int sum = 0;

        for (Candy candy: candies) {
            System.out.println(candy);
            sum += candy.calories;
        }

        System.out.printf("Total calories: %d%n", sum);
    }

    void travelTo(City newLocation) {
        this.location = newLocation;
    }

    City currentLocation() {
        return location;
    }
}
