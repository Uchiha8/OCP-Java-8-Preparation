package Chapter7.review.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapConcurrencyExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> synchronizedHashMap = Collections.synchronizedMap(new HashMap<>());
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        int countThread = 3;
        System.out.println("Testing HashMap");
        testMap(hashMap, countThread);
        System.out.println("Testing Synchronized HashMap");
        testMap(synchronizedHashMap, countThread);
        System.out.println("Testing Concurrent HashMap");
        testMap(concurrentMap, countThread);
    }

    private static void testMap(Map<Integer, String> map, int countThread) {

    }
}
