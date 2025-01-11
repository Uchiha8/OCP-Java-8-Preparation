package prepare;
interface Fly {
    public int getWingSpan() throws RuntimeException;

    public static final int max = 100;

    public default void land() {
        System.out.println("hello");
    }

    public static void hello(){
        System.out.println("Hello");
    }
}
