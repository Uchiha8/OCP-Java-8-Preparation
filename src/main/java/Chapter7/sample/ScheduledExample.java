package Chapter7.sample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        Runnable task1 = ()->{
            System.out.println("The task executed by " + System.currentTimeMillis());
        };

        service.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);
    }
}
