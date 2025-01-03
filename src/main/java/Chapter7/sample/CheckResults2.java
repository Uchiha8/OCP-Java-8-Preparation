package Chapter7.sample;

import java.util.concurrent.*;

public class CheckResults2 {
    private static int count = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResults2.count++;
                }
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");
        } catch (TimeoutException e) {
            System.out.println("Not reached");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
