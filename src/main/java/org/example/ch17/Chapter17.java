package org.example.ch17;

import java.util.Random;
import java.util.concurrent.*;

public class Chapter17 {

    public static void main(String[] args) {
        byte[] b = new byte[4000000];
        new Random().nextBytes(b);

        Callable<byte[]> c = new SorterCallable(b);
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<byte[]> result = executor.submit(c);

        try {
            byte[] bs = result.get();
            System.out.printf("%d, %d, %d%n", bs[0], bs[1], bs[bs.length - 1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Thread t = new Thread(() -> {
//            System.out.println(Thread.currentThread());
//            System.out.println(1 / 0);
//        }, "Waiting for a summer rain");
//
//        t.start();
//        System.out.println(t.isAlive());
////        Thread.sleep(1000);
//        System.out.println( Thread.currentThread() );
//        System.out.println( t.isAlive() );

//        System.out.println(Thread.currentThread());
//        Thread t1 = new Thread(new DateCommand());
//        t1.start();
//        Thread t2 = new Thread(new CounterCommand());
//        t2.start();
    }
}
