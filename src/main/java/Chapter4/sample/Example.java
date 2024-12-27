package Chapter4.sample;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Predicate<String> pd1 = String::isEmpty;
        Predicate<String> pd2 = x -> x.isEmpty();

        BiFunction<String, String, String> bi1 = String::concat;
        BiFunction<String, String, String> bi2 = (x, y) -> x + y;

        System.out.println(bi1.apply("hello ", "world"));
        System.out.println(bi2.apply("hello ", "uzb"));
    }

    public static Optional<Double> average(int[] scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (Integer i : scores) {
            sum += i;
        }
        return Optional.of((double) sum / scores.length);
    }
}
