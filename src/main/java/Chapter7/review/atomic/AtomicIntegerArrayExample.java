package Chapter7.review.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayExample {
    public static void main(String[] args) {
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(3);
        atomicIntegerArray.set(0, 5);
        System.out.println("Initial array: " + atomicIntegerArray);
        atomicIntegerArray.incrementAndGet(0);
        System.out.println("After Increment element at Index 0: " + atomicIntegerArray.get(1));
    }
}
