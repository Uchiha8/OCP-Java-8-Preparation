package Chapter7.review.atomic;

public class Test {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 2000; i++) {
                Counter.increment();
            }
        };

        Thread th1 = new Thread(task);
        Thread th2 = new Thread(task);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Final Count: " + Counter.getCount());
    }
}
