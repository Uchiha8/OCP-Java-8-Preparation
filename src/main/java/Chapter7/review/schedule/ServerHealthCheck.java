package Chapter7.review.schedule;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ServerHealthCheck {
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(2);

        Runnable task = () -> {
            System.out.println("Starting server health check at: " + System.currentTimeMillis());
            try {
                int checkDuration = new Random().nextInt(3000) + 1000;
                Thread.sleep(checkDuration);
                System.out.println("Health check completed in  " + checkDuration + " ms.");
            } catch (InterruptedException e) {
                System.out.println("Health check interrupted. " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        };
        schedule.scheduleWithFixedDelay(task, 2, 5, TimeUnit.SECONDS);
        schedule.schedule(() -> {
            System.out.println("Stopping health checks and shutting down scheduler...");
            schedule.shutdown();
        }, 30, TimeUnit.SECONDS);

    }
}
