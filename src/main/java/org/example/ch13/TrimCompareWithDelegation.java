package org.example.ch13;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

class StringUtils {
    public static int trimCompare(String s1, String s2) {
        return s1.trim().compareTo(s2.trim());
    }
}

public class TrimCompareWithDelegation {
    public static void main(String[] args) {
        Object[] words = { " ", '3', null, "2", 1, "" };
        Arrays.stream(words)
          .filter(Objects::nonNull)
          .map(Objects::toString)
          .map(String::trim)
          .filter(s -> !s.isEmpty())
          .map(Integer::parseInt)
          .sorted()
          .forEach(System.out::println);

        Stream.of(12.5, 11.5, 9.5)
          .map(BigDecimal::valueOf)
          .map(bigDecimal -> bigDecimal.pow(20))
          .forEach(System.out::println);

//        String[] words = { "A", "B", "a" };
//        Arrays.sort(words, (String s1, String s2) -> StringUtils.trimCompare(s1, s2));
//        System.out.println(Arrays.toString(words));
    }
}
