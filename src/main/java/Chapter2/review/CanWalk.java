package Chapter2.review;

public interface CanWalk {
    default void walk() {
        System.out.println("Walking");
    }

}
