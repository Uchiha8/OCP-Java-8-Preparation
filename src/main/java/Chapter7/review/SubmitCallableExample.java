package Chapter7.review;

import java.util.concurrent.*;

public class SubmitCallableExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Callable<Integer> task = ()-> {
            System.out.println("Callable task executed");
            return 42;
        };
        try {
            Future<Integer> future = service.submit(task);
            //retrieve the result of the task
            Integer result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
    }
}
