package org.example.ch8;

public class PriceUtils {
    static double calculateSum(Buyable first, Buyable... more) {
        double result = first.price();

        for (Buyable buyable: more) {
            result += buyable.price();
        }

        return result;
    }
}
