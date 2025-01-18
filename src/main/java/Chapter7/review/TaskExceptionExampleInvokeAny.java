package Chapter7.review;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.*;

public class TaskExceptionExampleInvokeAny {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        List<Callable<String>> tasks = List.of(
                () -> {
                    throw new RuntimeException("Task 1 failed");
                },
                () -> {
                    throw new IOException("Something wrong with provided file");
                }
        );

        try {
            String future = executor.invokeAny(tasks);
            System.out.println(future);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getSuppressed());
        }finally {
            executor.shutdown();
        }
    }
}
