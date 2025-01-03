package Chapter7.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class SchedulerTasks {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) {
            foodData.remove(key); // Trying to remove elements while iterating
        }
    }
}
