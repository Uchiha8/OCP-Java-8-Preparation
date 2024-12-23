package Chapter3.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Rose"));
        System.out.println(list.add("Rose"));

        Set<String> stringSet = new HashSet<>();
        System.out.println(stringSet.add("Cool"));
        System.out.println(stringSet.add("Cool"));

        List<String> birds = new ArrayList<>();
        birds.add("hawk1");
        birds.add("hawk");
        System.out.println(birds.remove(0));
        System.out.println(birds);
    }

    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
}
