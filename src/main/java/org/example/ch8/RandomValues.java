package org.example.ch8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class RandomValues implements Sortable<Integer> {
    private final List<Integer> values = new ArrayList<>();

    public RandomValues() {
        Random r = new Random();

        for (int i = r.nextInt(20) + 1; i > 0; i--) {
            values.add(r.nextInt(10000));
        }
    }

    @Override
    public Integer[] getValues() {
        return values.toArray(new Integer[values.size()]);
    }

    @Override
    public void setValues(Integer[] values) {
        this.values.clear();
        Collections.addAll(this.values, values);
    }
}
