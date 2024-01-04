package org.example.ch17;

import java.time.LocalDate;

public class JoinerRunnable implements Runnable {
    public int result;

    @Override
    public void run() {
        result = LocalDate.now().getDayOfYear();
    }

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("1.1 " + Thread.currentThread().getName());
            System.out.println("1.2 " + Thread.currentThread().getName());
        };

        Runnable r2 = () -> {
            System.out.println("2.1 " + Thread.currentThread().getName());
            System.out.println("2.2 " + Thread.currentThread().getName());
        };

//        JoinerRunnable runnable = new JoinerRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();
//        System.out.println(runnable.result);
    }
}
