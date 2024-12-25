package Chapter3.review;

import java.util.*;

public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Wildcard card = new Wildcard();
        Vector<? extends Number> list = new Vector<Integer>();
        card.showSize(list);
    }
}
