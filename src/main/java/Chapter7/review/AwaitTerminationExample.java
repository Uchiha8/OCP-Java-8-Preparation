package Chapter7.review;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            Callable<String> task = () -> {
                Thread.sleep(3000);
                return "Hello world";
            };
            executorService.submit(task);
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        if (executorService.isTerminated()) {
            System.out.println("All tasks have been done");
        } else {
            System.out.println("At least one task is still running");
        }
    }
}
