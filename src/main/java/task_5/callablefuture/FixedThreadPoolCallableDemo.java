package task_5.callablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadPoolCallableDemo {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();

        List<Future<Integer>> futures = new ArrayList<>();
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(cores * 100);
        try {
            for (int i = 0; i < 10000; i++) {
                futures.add(executorService.submit(new GenerateRandomIntegerCallableTask()));
            }
        } finally {
            executorService.shutdown();
            System.out.println("Get Result");
            futures.forEach(integerFuture -> {
                try {
                    System.out.println(integerFuture.get());
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });

            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("Processed in: " + duration + " ms");
        }
    }
}
