package org.example.ch13;

import java.util.function.Predicate;

class TruePredicate implements Predicate<Object> {
    @Override
    public boolean test(Object o) {
        return negate().test(o);
    }
}
