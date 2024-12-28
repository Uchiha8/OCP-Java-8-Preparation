package Chapter4.review;

import java.util.*;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.stream.*;

public class ReviewQuestions {
    public static void main(String[] args) {
        task16();
    }

    private static void task1() {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }

    private static void task2() {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growl! ");
        Stream<String> stream2 = Stream.generate(() -> "growl! ");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.allMatch(predicate);
        System.out.println(b1 + " " + b2);
    }

    private static void task3() {
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
        boolean b1 = stream.noneMatch(predicate);
        boolean b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
    }

    private static void task6() {
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.noneMatch(String::isEmpty);
        System.out.println(match);
    }

    private static List<String> task7(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }

    private static List<String> task7_2(List<String> list) {
        return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }

    private static void task8() {
        IntStream is = IntStream.empty();
        System.out.println(is.sum());
    }

    private static void task9() {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        //if (opt.isPresent()) System.out.println(opt.get());
        opt.ifPresent(System.out::println);
    }

//    private static void task14() {
//        Stream<Integer> s = Stream.of(1);
//        IntStream is = s.mapToInt(x -> x);
//        DoubleStream ds = s.mapToDouble(x -> x);
//        Stream<Integer> s2 = (Stream<Integer>) ds.mapToInt(x -> (int) x);
//        s2.forEach(System.out::println);
//    }

    private static void task16() {
        Stream<String> s = Stream.empty();
        Stream<String> s2 = Stream.empty();

        Map<Boolean, List<String>> p = s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
        Map<Boolean, List<String>> g = s2.collect(Collectors.groupingBy(b -> b.startsWith("c")));
        System.out.println(p + " " + g);
    }
}
