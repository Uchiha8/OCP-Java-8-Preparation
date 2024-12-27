package Chapter4.sample;

import javax.sound.sampled.EnumControl;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {
    private static int range(IntStream intStream) {
        IntSummaryStatistics stats = intStream.summaryStatistics();
        if (stats.getCount() == 0) {
            throw new RuntimeException();
        }
        return stats.getMax() - stats.getMin();
    }

    private static void threeDigit(Optional<Integer> optionalInteger) {
        if (optionalInteger.isPresent()) {
            Integer num = optionalInteger.get();
            String str = "" + num;
            if (str.length() == 3) {
                System.out.println(str);
            }
        }
    }

    private static void treeDigits(Optional<Integer> optional) {
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }

    private static void averagingxxx() {
        List<Integer> numbers = List.of(10, 20, 30, 40);
        double average = numbers.stream().collect(Collectors.averagingInt(n -> n));
        System.out.println("average: " + average);
    }

    private static void countingxx() {
        List<String> items = List.of("apple", "banana", "cherry");
        long count = items.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);
    }

    private static void graupingByXX() {
        List<String> list = List.of("apple", "banana", "cherry", "apircot", "hello", "hi");
        Map<Character, List<String>> groupingByFirstCharacter = list.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupingByFirstCharacter);
    }

    private static void joiningString() {
        String joined = list.stream().collect(Collectors.joining(", "));
        System.out.println(joined);
    }

    private static void maxMinBy() {
        List<Integer> numbers = List.of(10, 11, 43, 50, 23);
        Optional<Integer> max = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println("Max: " + max.get());

        Optional<Integer> min = numbers.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println("Min: " + min.get());
    }

//    private static void mappingX() {
//        Map<Integer, List<Integer>> groupedByLength = list.stream().collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList())));
//        System.out.println(groupedByLength);
//    }

    private static void partitioningX() {
        Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);
    }

    private static void summarizingPrimitive() {
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(n -> n));
        System.out.println(stats.getAverage());
    }

    private static void summingInt() {
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(sum);
    }

    private static void toMapX() {
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(
                item -> item,
                String::length
        ));
        System.out.println(map);
    }

    private static void sample1() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result = ohMy.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result);
    }

    static List<String> list = List.of("apple", "banana", "cherry", "apircot", "hello", "hi");
    static List<Integer> numbers = List.of(1, 23, 4, 5, 5, 7, 8, 6, 45, 4, 3);

    public static void main(String[] args) {
        sample1();
    }
}
