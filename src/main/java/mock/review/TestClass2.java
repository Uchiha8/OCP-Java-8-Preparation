package mock.review;

public class TestClass2 implements Runnable {
    int x=0, y = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                x++; y++;
                System.out.println(" x = " + x + " , y = " + y);
            }
        }
    }

    public static void main(String[] args) {
        TestClass2 tc = new TestClass2();
        new Thread(tc).start();
        new Thread(tc).start();
    }
}
