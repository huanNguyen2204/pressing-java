package org.example.ch9;

public class MissNumberFormatException {
    public static int getVatRate() {
        return Integer.parseInt("19%");
    }

    public static void main(String[] args) {
        String stringToConvert = "19%";
        int vat = 19;

        try {
            vat = Integer.parseInt(stringToConvert);
        } catch (NumberFormatException e) {
            System.err.printf("'%s' cannot be converted to a number! %n", stringToConvert);
        }

        System.out.printf("Moving on to VAT=%d%n", vat);
    }
}
