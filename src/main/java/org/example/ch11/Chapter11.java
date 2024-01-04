package org.example.ch11;

public class Chapter11 {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(1);
        Double d2 = Double.valueOf(1);

        System.out.println(d1 >= d2);
        System.out.println(d1 <= d2);
        System.out.println(d1 == d2);
        System.out.println(d1 == d2 - 0);

//        String number = "38317";
//        int integer = 0;
//
//        try {
//            integer = Integer.parseInt(number);
//        } catch (NumberFormatException e) {
//            System.err.println("Error converting " + number);
//        }
//
//        System.out.println(integer);

//        Double d = 12.12;
//        System.out.println(d.hashCode());
//        System.out.println(Double.hashCode(12.12));

//        String
//          s1 = Integer.toString(1234567891),
//          s2 = Long.toString(1234567891L),
//          s3 = Float.toString(1234567891f),
//          s4 = Double.toString(12.345678912),
//          s5 = Boolean.toString(true);
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s5);

//        Player susi = new Player();
//        susi.age = 29;
//        susi.name = "Susi";
//
//        Player dolly = susi.clone();
//        System.out.println(dolly.name + " is " + dolly.age);
    }
}
