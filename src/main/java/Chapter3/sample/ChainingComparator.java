package Chapter3.sample;

import java.util.Comparator;

public class ChainingComparator implements Comparator<Squirrel> {
    @Override
    public int compare(Squirrel o1, Squirrel o2) {
        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
        c = c.thenComparingInt(s -> s.getWeight());
        return c.compare(o1, o2);
    }
}
