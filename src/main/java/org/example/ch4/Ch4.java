package org.example.ch4;

import java.util.Arrays;
import java.util.Scanner;
import java.awt.Point;

public class Ch4 {
//    static int[] productAndSum(int a, int b) {
//        return new int[]{ a * b, a + b };
//    }

//    static double avg(double[] numbers) {
//        double sum = 0;
//
//        for (int i = 0; i < numbers.length; i++)
//            sum += numbers[i];
//
//        return sum / numbers.length;
//    }

    static void rotateLeft(int[] numbers) {
        int first = numbers[0];
        System.arraycopy(numbers, 1, numbers, 0, numbers.length - 1);
        numbers[numbers.length - 1] = first;
    }

    static void rotateRight(int[] numbers) {
        int last = numbers[numbers.length - 1];
        System.arraycopy(numbers, 0, numbers, 1, numbers.length - 1);
        numbers[0] = last;
    }

    public static void main(String[] args) {
        Point playerPosition = new Point(10, 9);
        Point goldPosition = new Point(6, 6);
        Point doorPosition = new Point(0, 5);

        Point[] snakePositions = new Point[5];
        int snakeIdx = 0;
        snakePositions[snakeIdx] = new Point(30, 2);
        boolean rich = false;

        while (true) {
            if (rich && playerPosition.equals(doorPosition)) {
                System.out.println("You won!!");
                break;
            }

            if (Arrays.asList(snakePositions).contains(playerPosition)) {
                System.out.println("SSSSSS. You were bitten by the snake!");
                break;
            }

            if (playerPosition.equals(goldPosition)) {
                rich = true;
                goldPosition.setLocation(-1, -1);
            }
        }

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 40; x++) {
                Point p = new Point(x, y);
                if (playerPosition.equals(p))
                    System.out.println('&');
                else if (Arrays.asList(snakePositions).contains(p))
                    System.out.println('S');
                else if (goldPosition.equals(p))
                    System.out.print('$');
                else if (doorPosition.equals(p))
                    System.out.print('#');
            }
            System.out.println();
        }

        switch (new java.util.Scanner(System.in).next()) {
            case "u" -> playerPosition.y = Math.max(0, playerPosition.y - 1);
            case "d" -> playerPosition.y = Math.min(9, playerPosition.y + 1);
            case "l" -> playerPosition.x = Math.max(0, playerPosition.x - 1);
            case "r" -> playerPosition.x = Math.min(39, playerPosition.x + 1);
        }

        Point snakedHead = new Point(snakePositions[snakeIdx].x, snakePositions[snakeIdx].y);

        if (playerPosition.x < snakedHead.x)
            snakedHead.x--;
        else if (playerPosition.x > snakedHead.x)
            snakedHead.x++;

        if (playerPosition.y < snakedHead.y)
            snakedHead.y--;
        else if (playerPosition.y > snakedHead.y)
            snakedHead.y++;

        snakeIdx = (snakeIdx + 1) % snakePositions.length;
        snakePositions[snakeIdx] = snakedHead;
//        int[] numbers = { 1, 10, 100, 1000 };
//
//        System.out.println(Arrays.binarySearch(numbers, 100));

//        String[] words1 = { "normal", "is", "boring" };
//        String[] words2 = { "is", "boRing", "NoRmal" };
//
//        Arrays.sort(words1, String.CASE_INSENSITIVE_ORDER);
//        Arrays.sort(words2, String.CASE_INSENSITIVE_ORDER);
//
//        System.out.println(Arrays.equals(words1, words2, String.CASE_INSENSITIVE_ORDER));

//        int[] numbers = { 1, 2, 3, 4 };
//        rotateLeft(numbers);
//        rotateRight(numbers);
//        rotateRight(numbers);
//
//        System.out.println(numbers);
//        int[][] triangle = new int[7][];
//
//        for (int row = 0; row < triangle.length; row++) {
//            System.out.print(" ".repeat(14 - 2 * row));
//
//            triangle[row] = new int[row + 1];
//
//            for (int col = 0; col <= row; col++) {
//                if ((col == 0) || (col == row))
//                    triangle[row][col] = 1;
//                else
//                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
//                System.out.printf("%3d ", triangle[row][col]);
//            }
//            System.out.println();
//        }

//        Point[] players = new Point[5];
//
//        for (int i = 0; i < players.length; i++) {
//            players[i] = new Point((int) (Math.random() * 40), (int) (Math.random() * 10));
//        }
//
//        for (int y = 0; y < 10; y++) {
//            for (int x = 0; x < 40; x++) {
//                if (Arrays.asList(players).contains(new Point(x, y)))
//                    System.out.print('&');
//                else
//                    System.out.print('.');
//            }
//
//            System.out.println();
//        }

//        String input = null;
//        boolean found = false;
//
//        while (!found) {
//            input = new Scanner(System.in).nextLine();
//        }

//        double[] prices;
//        prices = new double[]{ 2, 5, 7, 8, 12 };
//
//        for (int i = 0; i < prices.length; i++) {
//            System.out.println(prices[i]);
//        }

//        System.out.println(productAndSum(9, 3)[1]);
//        double[] prices = { 2, 3, 4 };
//        System.out.println(avg(prices));

//        int[] array = new int[4];
//        int i = 0;
//
//        while (i < array.length) {
//            array[i] = i++;
//        }

//        double[] numbers = { 1.9, 7.8, 2.4, 9.3 };
//        double sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//
//        double avg = sum / numbers.length;
//        System.out.println(avg);

//        double[] prices = { 2.99, 3.10, 4.40, 0.90 };
//        String[] names = {
//          "Caramellos", "Gummi Fish",
//          "Starbursts".toUpperCase(),
//          new StringBuilder("M").append('M').toString()
//        };

//        double[] prices;
//        double[][] matrix;
//        double[][][] threeDimMatrix;
    }
}
