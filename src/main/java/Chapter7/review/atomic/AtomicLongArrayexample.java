package Chapter7.review.atomic;

import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArrayexample {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(3);
        atomicLongArray.set(1, 10);
        System.out.println("Initial Array: " + atomicLongArray);
        atomicLongArray.addAndGet(1, 50);
        System.out.println("After Adding 15 to index 1: " + atomicLongArray.get(1));
        System.out.println(atomicLongArray.getAndDecrement(1));
        System.out.println(atomicLongArray.get(1));
    }
}
