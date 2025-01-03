package Chapter7.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zooinfo {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            System.out.println("begin");
            service.submit(()->{
                System.out.println("Printing zoo inventory");
            });
            service.submit(()->{
                for (int i = 0; i < 3; i++) {
                    System.out.println("Records " + i);
                }
            });
            service.submit(()->{
                System.out.println("Printing the zoo inverntory");
            });
            System.out.println("end");
        }finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
