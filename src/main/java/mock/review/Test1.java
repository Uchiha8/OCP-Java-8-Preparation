package mock.review;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        q51();
    }

    static void q52() {
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x -> x.length();
        Consumer<Integer> c = x -> System.out.println("Len:" + x + " ");
        strList.stream().map(f).forEach(c);
    }

    static void q51() {
        Stream<String> names = Stream.of("Sarah Adams", "Suzy Pinnell", "Paul Basgall");
        Stream<String> firstNames = names.map(e -> e.split(" ")[0]);
        firstNames.forEach(System.out::println);
    }

    static void q50() {
        List<Integer> str = Arrays.asList(1, 2, 3, 4);
        str.stream().filter(x -> {
            System.out.println(x + " ");
            return x > 2;
        });
    }

    static void q40() {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));
        System.out.println(ls.stream().max(Integer::max).get()); //2
        System.out.println(ls.stream().max(Integer::compare).get()); //3
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b)); //4
    }

    static void q7() {
        AtomicInteger ai = new AtomicInteger(5);
        int x = ai.get();
        System.out.println(x);
    }

    static void q3_4() {
        IntFunction<String> num = x -> x % 2 == 0 ? "Even" : "Odd";
        List<Integer> list = List.of(1, 2, 3, 54, 2, 3, 5);
        list.stream().map(num::apply).forEach(System.out::println);
    }

    static void q3_3() {
        IntFunction<String> num = "*"::repeat;
        List<Integer> list = List.of(1, 2, 3, 54, 2, 3, 5);
        list.stream().map(num::apply).forEach(System.out::println);

    }

    static void q3_2() {
        IntFunction<String> num = x -> "Square of " + x + " is " + (int) Math.pow(x, 2);
        List<Integer> list = List.of(1, 2, 3, 54, 2, 3, 5);
        list.stream().map(num::apply).forEach(System.out::println);
    }

    static void q3_1() {
        IntFunction<String> num = x -> "Number: " + x;
        List<Integer> list = List.of(1, 2, 3, 54, 2, 3, 5);
        list.stream().map(num::apply).forEach(System.out::println);
    }

    static void q3() {
        List<Item> l = Arrays.asList(
                new Item(1, "Screw"),
                new Item(2, "Nail"),
                new Item(3, "Bolt")
        );
        l.stream().map(i -> i.getName()).sorted().forEach(System.out::println);

    }

    static void q2() {
        Map hm = new ConcurrentHashMap();
        hm.put(null, "asdf");
        hm.put("aaa", null);

        hm = new HashMap();
        hm.put(null, "asdf");
        hm.put("aaa", null);

        List list = new ArrayList();
        list.add(null);
        list.add(null);

        list = new CopyOnWriteArrayList();
        list.add(null);
    }

    static void q1() {
        Map<String, List<String>> stateCitiesMap = new HashMap<String, List<String>>();
        List<String> cities = new ArrayList<>();
        cities.add("New york");
        cities.add("Albany");
        stateCitiesMap.put("NY", cities);
    }
}
