package Chapter7.review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitRunnableExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> future = service.submit(() -> System.out.println("Runnable task executed"));
            // wait for task completion(return null for runnable)
            Object o = (Object) future.get();
            System.out.println(o);
            System.out.println("Task completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            service.shutdown();
        }
    }
}
