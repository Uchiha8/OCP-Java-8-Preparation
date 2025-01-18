package Chapter7.review;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> {
            Thread.sleep(2000);
            return "Task 1 result";
        });
        tasks.add(() -> {
            Thread.sleep(2000);
            return "Task 2 result";
        });
        tasks.add(() -> {
            Thread.sleep(2000);
            return "Task 3 result";
        });
        tasks.add(() -> {
            Thread.sleep(2000);
            return "Task 4 result";
        });
        try {
            // get the result of the first completed task
            String result = executorService.invokeAny(tasks);
            System.out.println(result);
        } catch (InterruptedException | ExecutionException exception) {
            System.out.println(exception.getMessage());
        }finally {
            executorService.shutdown();
        }
    }
}
