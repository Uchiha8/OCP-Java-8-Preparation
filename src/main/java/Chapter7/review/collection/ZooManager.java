package Chapter7.review.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {
    private Map<String, Integer> map = new ConcurrentHashMap<>();
    public void put(String key, Integer value) {
        map.put(key, value);
    }
    public Object get(String key) {
        return map.get(key);
    }

    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();
        zooManager.put("Hello1", 5);
        zooManager.put("Hello2", 6);
        zooManager.put("Hello3", 7);
        System.out.println(zooManager.get("Hello2"));
        System.out.println(zooManager.map);
    }
}
