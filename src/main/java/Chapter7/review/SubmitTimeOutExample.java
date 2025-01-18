package Chapter7.review;

import java.util.concurrent.*;

public class SubmitTimeOutExample {
    public static void main(String[] args) {
        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 21;
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(task);
        try {
            int num = result.get(1, TimeUnit.SECONDS);
            System.out.println(num);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
