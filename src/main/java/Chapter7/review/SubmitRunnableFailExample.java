package Chapter7.review;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitRunnableFailExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(() -> System.out.println("Task 1"));
            Future<?> future = executorService.submit(() -> {
                throw new RuntimeException("Sorry buddy");
            });
            future.get();
        } catch (ExecutionException | InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }

        try {
            executorService.execute(() -> System.out.println("Next task"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }
    }
}
