package Chapter7.review.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {
    public static void main(String[] args) {
        AtomicBoolean flag = new AtomicBoolean(false);
        System.out.println("Initial value: " + flag.get());
        boolean update = flag.compareAndSet(false, true);
        System.out.println("Updated to true: " + update);
        System.out.println("Current value: " + flag.get());
    }
}
