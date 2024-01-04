package org.example.ch9;

public class AssertKeyword {
    public static double subAndSqrt(double a, double b) {
        double result = Math.sqrt(a - b);
        assert !Double.isNaN(result): "Calculation result is NaN";
        return result;
    }

    public static void main(String[] args) {
        System.out.println( "Sqrt(10-2)=" + subAndSqrt(10, 2) );
        System.out.println( "Sqrt(2-10)=" + subAndSqrt(2, 10) );
    }
}
