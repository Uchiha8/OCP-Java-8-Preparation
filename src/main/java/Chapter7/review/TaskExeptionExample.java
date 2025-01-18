package Chapter7.review;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskExeptionExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = List.of(
                () -> "Task 1",
                () -> {
                    throw new RuntimeException("Task failed");
                }
        );

        try {
            List<Future<String>> results = executor.invokeAll(tasks);
            for (Future<String> future : results) {
                try {
                    String res = future.get();
                    System.out.println(res);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            executor.shutdown();
        }
    }
}
