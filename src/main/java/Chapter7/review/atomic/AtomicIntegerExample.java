package Chapter7.review.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("Initial value: " + atomicInteger.get());
        atomicInteger.incrementAndGet();
        System.out.println("After increment: " + atomicInteger.get());
        System.out.println("After adding 5: " + atomicInteger.getAndAdd(5));
        System.out.println("After adding 5: " + atomicInteger.get());
    }
}
