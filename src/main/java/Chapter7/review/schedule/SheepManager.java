package Chapter7.review.schedule;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private void incrementAndReport() {
        System.out.print(atomicInteger.incrementAndGet()+" ");
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            SheepManager sheepManager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                executorService.submit(sheepManager::incrementAndReport);
            }
        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }
}
