package Chapter7.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = () -> {
            System.out.println("Task 1 executed by " + Thread.currentThread().getName());
        };
        Runnable task2 = () -> {
            System.out.println("Task 2 executed by " + Thread.currentThread().getName());
        };
        Runnable task3 = () -> {
            System.out.println("Task 3 executed by " + Thread.currentThread().getName());
        };
        Runnable task4 = () -> {
            System.out.println("Task 4 executed by " + Thread.currentThread().getName());
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        executorService.shutdown();
    }
}
