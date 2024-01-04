package org.example.ch12;

import java.util.List;

class PortableUtils {
    public static boolean areLighterThan(List<? extends Portable> list, double maxWeight) {
        double accumulatedWeight = 0.0;

        for (Portable portable : list)
            accumulatedWeight += portable.getWeight();

        return accumulatedWeight < maxWeight;
    }
}
