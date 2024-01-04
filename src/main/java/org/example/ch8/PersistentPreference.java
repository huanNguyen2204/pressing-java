package org.example.ch8;

import java.util.prefs.Preferences;
import java.util.logging.*;
import java.util.*;

interface Sortable<T extends Comparable<?>> {
    T[] getValues();
    void setValues(T[] values);
    default void sort() {};
}

interface Logged {
    default void error(String message) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, message);
    }

    default void warn(String message) {
        Logger.getLogger(getClass().getName()).log(Level.WARNING, message);
    }

    default void info(String message) {
        Logger.getLogger(getClass().getName()).log(Level.INFO, message);
    }
}

interface PersistentPreference {
    default void store(String key, String value) {
        Preferences.userRoot().put(key, value);
    }

    default String get(String key) {
        return Preferences.userRoot().get(key, "");
    }
}
