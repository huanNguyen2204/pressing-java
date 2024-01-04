package org.example.ch15;

import java.util.List;
import java.util.Locale;

public class YummyTester {

    public static boolean testYumminess(String name) {
        return List.of("ding ding tong", "meiji", "balikutsa", "pez", "gumballs")
          .contains(name.toLowerCase(Locale.ROOT));
    }
}
