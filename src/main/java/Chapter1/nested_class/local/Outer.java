package Chapter1.nested_class.local;

public class Outer {
    private int length = 5;

    public void calculate() {
        int width=20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }
}
