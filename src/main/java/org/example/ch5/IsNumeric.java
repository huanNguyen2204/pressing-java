package org.example.ch5;

import org.example.Main;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class IsNumeric {
    public static boolean isNumeric(String string) {
        if (string == null || string.length() == 0)
            return false;

        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i)))
                return false;
        }
        return true;
    }

    static boolean containsCandyName(String text) {
        text = text.toLowerCase();
        String[] candyNames = { "Starburst", "Snackers", "N&n", "Cold tamales" };

        for (String candyName: candyNames) {
            if (text.contains(candyName))
                return true;
        }

        return false;
    }

    public static int frequency(String source, String part) {
        if (source == null || source.isEmpty() || part == null || part.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int pos = 0; (pos = source.indexOf(part, pos)) != -1; count++) {
            pos += part.length();
        }

        return count++;
    }

    public static void main(String[] args) {


//        double bitcoinPrice = ThreadLocalRandom.current().nextDouble(50_000);
//        System.out.printf("%.2f%n", bitcoinPrice);
//        System.out.printf(Locale.ENGLISH, "%.2f%n", bitcoinPrice);

//        double[] prices = { 1.90, 2.49 };
//        StringJoiner joiner = new StringJoiner("; ");
//        for (double price: prices) {
//            joiner.add(String.format(Locale.ENGLISH, "USD %.2f", price));
//        }
//
//        System.out.println(joiner);

//        String string = Long.toString(2656437647773L, 36);
//        System.out.println(string);
//
//        long l = Long.parseLong(string, 36);
//        System.out.println(l);

//        String s1 = String.valueOf(10);
//        String s2 = String.valueOf(Math.PI);
//        String s3 = String.valueOf(1 < 2);
//
//        System.out.printf("%s, %s, %s", s1, s2, s3);
//
//        String r = String.valueOf(new java.awt.Point());
//        String t = String.valueOf(java.time.LocalTime.now());
//
//        System.out.printf("%s, %s", r, t);


//        StringBuilder sb1 = new StringBuilder("The Ocean Cleanup");
//        StringBuilder sb2 = new StringBuilder("The Ocean Cleanup");
//
//        System.out.println(sb1.compareTo(sb2) == 0);
//        System.out.println(CharSequence.compare(sb1, sb2) == 0);

//        String s = "Cognition Amplifier";
//        StringBuilder sb = new StringBuilder("Cognition Amplifier");
//
//        System.out.println(s.equals(sb));
//        System.out.println(s.equals(sb.toString()));
//        System.out.println(s.contentEquals(sb));

//        String a1 = "iPad", a2 = "Paid";
//
//        char[] a1chars = a1.toCharArray();
//        char[] a2chars = a2.toCharArray();
//
//        Arrays.sort(a1chars);
//        Arrays.sort(a2chars);
//
//        boolean isAnangram = new String(a1chars).equalsIgnoreCase(new String(a2chars));
//
//        System.out.println(isAnangram);
//
//        StringBuilder sb = new StringBuilder("save water, showen together");
//        char upperChar = Character.toUpperCase(sb.charAt(0));
//        sb.setCharAt(0, upperChar);

//        String input = javax.swing.JOptionPane.showInputDialog("Password");
//        String excepted = "qwerty123";
//
//        System.out.println(input == excepted);
//        System.out.println(input.equals(excepted));
//        System.out.println(excepted.equals(input));
//        System.out.println(Objects.equals(excepted, input));

//        String hangmanWord = "alligatoralley";
//        String usedChar = "";
//
//        String guessedWord = "";
//        for (int i = 0;  i < hangmanWord.length(); i++) {
//            guessedWord += "_";
//        }

//        for (int guessedWord = 0; guessedWord++) {
//            if (guessedWord == 10) {
//                System.out.printf("Sorry, game over after 10 attempts, Sneaking of which, the word was '%s'. ", hangmanWord);
//            }
//            break;
//        }

//        System.out.println(frequency("cherry schnaps, schiztle", "sch"));
//        System.out.println(frequency("cherry schnaps, schiztle", "zel"));
//        System.out.println(frequency("cherry schnaps, schiztle", ""));

//        String msg1 = "Starburst is so delicious";
//        System.out.println(containsCandyName(msg1));
//
//        String msg2 = "I only like warm milk";
//        System.out.println(containsCandyName(msg2));

//        String input = new java.util.Scanner(System.in).nextLine();
//
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//
//            if (Character.isWhitespace(c))
//                System.out.println('_');
//            else if (Character.isLetter(c))
//                System.out.println(Character.toUpperCase(c));
//        }
//        System.out.println(isNumeric("1234"));
//        System.out.println(isNumeric("12.4"));
//        System.out.println(isNumeric("-123"));
    }
}
