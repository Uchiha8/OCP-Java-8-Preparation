package Chapter7.review;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            Runnable task = () -> {
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                }
            };
            Future<?> results = executorService.submit(task);
            String str = (String) results.get(2, TimeUnit.SECONDS);
            System.out.println(str);
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
