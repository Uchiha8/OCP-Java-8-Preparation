package prepare;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().compareTo(o1.toLowerCase());
    }

    public static void main(String[] args) {
        String[] strings = {"123", "Abb", "aab"};
        Arrays.sort(strings, new MyComparator());
        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}
