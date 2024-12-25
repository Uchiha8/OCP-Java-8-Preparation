package Chapter3.sample;

import java.util.Comparator;

public class MultiFieldComparator implements Comparator<Squirrel> {

    @Override
    public int compare(Squirrel o1, Squirrel o2) {
        int result = o1.getSpecies().compareTo(o2.getSpecies());
        if (result!=0) return result;
        return o1.getWeight() - o2.getWeight();
    }

}
