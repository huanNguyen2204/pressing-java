package org.example.ch17;

import java.util.List;
import java.util.concurrent.*;

public class WrappedUser {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);
        List.of(4, 3, 2, 1).forEach(duration -> completionService.submit(() -> {
            TimeUnit.SECONDS.sleep(duration);
            return duration;
        }));

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(completionService.take().get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

//        Callable<String> username = () -> System.getProperty("user.name");
//        FutureTask<String> wrappedUsername = new FutureTask<>(username) {
//            @Override
//            protected void done() {
//                try {
//                    System.out.printf("done: isDone=%s, isCancelled=%s%n", isDone(), isCancelled());
//                    System.out.println("done: get=" + get());
//                } catch (InterruptedException | ExecutionException e) {}
//            }
//
//            @Override
//            protected void set(String v) {
//                System.out.println("set: " + v);
//                super.set(v.toUpperCase());
//            }
//        };
//
//        ExecutorService scheduler = Executors.newCachedThreadPool();
//        scheduler.submit(wrappedUsername);
////        System.out.println("main: " + wrappedUsername.get);
//        scheduler.shutdown();
    }
}
