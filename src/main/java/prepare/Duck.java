package prepare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private Long id;
    private String name;

    public Duck(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Duck o) {
        return id.compareTo(o.id);
    }

    public static void main(String[] args) {
        List<Duck> list = new ArrayList<>();
        list.add(new Duck(2L, "Hello"));
        list.add(new Duck(3L, "Hello"));
        list.add(new Duck(1L, "Hello"));
        list.add(new Duck(5L, "Hello"));
        Collections.sort(list);
        System.out.println(list);
    }
}
