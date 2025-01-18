package mock.review;

public class TestClass implements Runnable {
    volatile int x;
    @Override
    public void run() {
        x = 5;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.x = 10;
        new Thread(tc).start();
        System.out.println(tc.x);
    }
}
