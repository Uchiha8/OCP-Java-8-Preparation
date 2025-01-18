package Chapter7.review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PersistentExecutor {
    private static final ExecutorService service = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        service.execute(()-> System.out.println("Task 1 executed by persistent executor."));
        service.execute(() -> System.out.println("Task 2 executed by persistent executor."));
        System.out.println("Main thread is doing something");
        shutdownExecutor();
    }

    private static void shutdownExecutor() {
        if (!service.isShutdown()) {
            System.out.println("Shutting down executor...");
            service.shutdown();
        }
    }
}
