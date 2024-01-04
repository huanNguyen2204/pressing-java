package org.example.ch13;

import java.util.*;
import java.util.function.Predicate;

public class Chapter13 {

//    public static int factorial(int n) {
//        return n == 0 ? 1 : n * factorial(n - 1);
//    }

    public static void main(String[] args) {
        Person john = new Person();
        System.out.println(john.getSpouse().isEmpty());

        Person eve = new Person();
        john.setSpouse(eve);

        System.out.println(john.getSpouse().isPresent());
        System.out.println(john.getSpouse().get());

        john.removeSpouse();
        System.out.println(john.getSpouse().isEmpty());

//        Predicate<Character> isDigit = Character::isDigit;
//        Predicate<Character> isNotDigit = isDigit.negate();
//
//        List<Character> list = new ArrayList<>(Arrays.asList('a', '1'));
//        list.removeIf(isNotDigit);


//        boolean ignoreCase = new Scanner(System.in).nextBoolean();
//        Comparator<String> c = (s1, s2) -> ignoreCase ?
//          s1.trim().compareToIgnoreCase(s2.trim()) :
//          s1.trim().compareTo(s2.trim());
//
//        String[] words = { "M", "\nSkyfall", "Q", "\\t\\tAdele\\t" };
//        Arrays.sort(words, c);
//        System.out.println(Arrays.toString(words));

//        class TrimComparator implements Comparator<String> {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.trim().compareTo(s2.trim());
//            }
//        }
//
//        String[] words = { "M", "\nSkyfall", "Q", "\t\tAdele\t" };
////        Arrays.sort(words, new TrimComparator());
////        Arrays.sort(words, new Comparator<String>() {
////            @Override
////            public int compare(String s1, String s2) {
////                return s1.trim().compareTo(s2.trim());
////            }
////        });
//
//        Comparator<String> c = (String s1, String s2) -> { return s1.trim().compareTo(s2.trim()); };
//        Arrays.sort(words, c);
//        System.out.println(Arrays.toString(words));
    }
}
