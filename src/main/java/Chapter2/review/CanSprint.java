package Chapter2.review;

public interface CanSprint extends CanWalk, CanRun {
    @Override
    default void walk() {
        CanWalk.super.walk();
    }

    void sprint();

}
