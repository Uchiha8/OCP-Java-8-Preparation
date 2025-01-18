package Chapter7.review.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {
    public static void main(String[] args) {
        AtomicReference<String> reference = new AtomicReference<String>("Initial value");
        System.out.println("Initial value: " + reference.get());
        reference.set("Update value");
        System.out.println("After Update: " + reference.get());
        System.out.println(reference.getAndSet("Updated value 2"));
        System.out.println(reference.get());
    }
}
