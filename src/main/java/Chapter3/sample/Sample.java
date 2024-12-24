package Chapter3.sample;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        System.out.println(set.lower(10));
        
    }
}
