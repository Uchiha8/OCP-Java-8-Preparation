package Chapter3.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator
        ;
import java.util.List;

public class SortRabbits {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);
    }
}
