package task_5.executors;

import task_5.executors.task.GenerateRandomIntegerTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 100_000; i++) {
                executorService.submit(new GenerateRandomIntegerTask());
            }
            System.out.println("TEST");
        } finally {
            executorService.shutdown();
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("Processed in: " + duration + " ms");
        }
    }
}
