package org.example.ch18;

import java.text.BreakIterator;
import java.util.*;

public class WhereHaveYouBeen {

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

//        Comparator<String> comparator =
//            (s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s1.trim(), s2.trim());
//
//        Set<String> set = new TreeSet<>(comparator);
//
//        set.add("xxx");
//        set.add("XXX");
//
//        System.out.println(set);
//        System.out.println(set.contains("XXX"));

//        Set<String> allCities = new HashSet<>();
//
//        allCities.add("Seattle");
//        allCities.add("Denver");
//        allCities.add("Manila");
//        allCities.add("Seoul");
//        allCities.add("Siquijor");
//
//        Set<String> visitedCities = new TreeSet<>();
//
//        String sentence = "From Seattle I drive to Denver and fly to Manila.";
//        BreakIterator iter = BreakIterator.getWordInstance();
//        iter.setText(sentence);
//
//        for ( int first = iter.first(), last = iter.next();
//              last != BreakIterator.DONE;
//              first = last, last = iter.next() ) {
//            String word = sentence.substring( first, last );
//            if (
//                allCities.contains( word ) ) visitedCities.add( word );
//        }
//
//        System.out.println("Number of visited cities: " + visitedCities.size());
//        System.out.println("Number of visited cities: " + (allCities.size() - visitedCities.size()));
//        System.out.println("Visited cities: " + String.join(", ", visitedCities));
//
//        Set<String> unvisitedCities = new TreeSet<>(allCities);
//        unvisitedCities.removeAll(visitedCities);
    }
}
