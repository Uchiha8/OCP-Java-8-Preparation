package Chapter3.sample;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Sample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        System.out.println(set.lower(10));

        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList();

        List<String> stringList = new ArrayList<>();
        stringList.add("Magician");
        stringList.add("Alison");
        System.out.println(stringList);
        stringList.removeIf(s -> s.startsWith("A"));
        System.out.println(stringList);

        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream().map(x -> x * 2).forEach(System.out::println);

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);

        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites);

        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites1 = new HashMap<>();
        favorites1.put("Jenny", "Bus Tour");
        favorites1.put("Tom", "Tram");

        String jenny = favorites1.merge("Jenny", "Skyride", mapper);
        String tom = favorites1.merge("Tom", "Skyride", mapper);

        System.out.println(favorites1);
        System.out.println(jenny);
        System.out.println(tom);


        BiFunction<String, String, String> mapper1 = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Sam", null);
        stringStringMap.merge("Tom", "Skyride", mapper1);
        stringStringMap.merge("Sam", "Skyride", mapper1);
        System.out.println(stringStringMap);

        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        BiFunction<String, Integer, Integer> mapper2 = (k, v) -> v + 1;
        Integer m1 = counts.computeIfPresent("Jenny", mapper2);
        Integer m2 = counts.computeIfPresent("Sam", mapper2);
        System.out.println(counts);
        System.out.println(m1);
        System.out.println(m2);
    }
}
