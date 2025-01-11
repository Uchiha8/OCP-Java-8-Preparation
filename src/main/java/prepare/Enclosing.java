package prepare;

public class Enclosing {
    private static int value = 10;
    static class Inner{
        private int price = 6;

        static void calculate() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner.price);
        Inner.calculate();
    }
}
