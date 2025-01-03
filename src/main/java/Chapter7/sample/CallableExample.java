package Chapter7.sample;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<String> task = () ->
        {
            Thread.sleep(2000);
            return "Task results";
        };

        Future<String> future = service.submit(task);
        System.out.println("Task submited waiting for results...");
        String result = future.get();
        System.out.println("Result " + result);

        service.shutdown();
    }
}
