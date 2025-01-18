package Chapter7.review;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> "Task 1 result");
        tasks.add(() -> "Task 2 result");
        tasks.add(() -> "Task 3 result");

        try {
            List<Future<String>> futures = executorService.invokeAll(tasks);

            //retrieve results from each task
            for (Future<String> future : futures) {
                System.out.println("Results: " + future.get());
            }

        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }finally {
            executorService.shutdown();
        }

    }
}
