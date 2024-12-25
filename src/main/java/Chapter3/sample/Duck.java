package Chapter3.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Duck(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return this.name.compareTo(d.name);
    }

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Bob"));
        ducks.add(new Duck("Alison"));
        Collections.sort(ducks);
        System.out.println(ducks);
        Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();
    }

    Comparator<Duck> byWeight = new Comparator<Duck>() {
        @Override
        public int compare(Duck o1, Duck o2) {
            return o1.getWeight() - o2.getWeight();
        }
    };
}
