package Chapter3.review;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomSorted implements Comparable<CustomSorted>, Comparator<CustomSorted> {
    private int value;
    private String key;

    public CustomSorted(int value, String key) {
        this.value = value;
        this.key = key;
    }

    public String toString() {
        return "[" + key + ", " + value + "]";
    }


    @Override
    public int compareTo(CustomSorted o) {
        return this.key.compareTo(o.key);
    }

    @Override
    public int compare(CustomSorted o1, CustomSorted o2) {
        return o2.value - o1.value;
    }

    public static void main(String[] args) {
        CustomSorted customSorted1 = new CustomSorted(10, "apple");
        CustomSorted customSorted2 = new CustomSorted(5, "banana");
        CustomSorted customSorted3 = new CustomSorted(20, "cherry");

        TreeSet<CustomSorted> set1 = new TreeSet<>();
        set1.add(customSorted1);
        set1.add(customSorted2);
        set1.add(customSorted3);

        TreeSet<CustomSorted> set2 = new TreeSet<>(customSorted1);
        set2.add(customSorted1);
        set2.add(customSorted2);
        set2.add(customSorted3);

        System.out.println(set1);
        System.out.println(set2);
    }
}
