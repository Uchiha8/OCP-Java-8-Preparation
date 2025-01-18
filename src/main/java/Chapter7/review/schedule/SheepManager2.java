package Chapter7.review.schedule;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager2 {
    private int sheepCount = 0;

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            SheepManager2 sheepManager = new SheepManager2();
            for (int i = 0; i < 10; i++) {
                executorService.submit(sheepManager::incrementAndReport);
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
