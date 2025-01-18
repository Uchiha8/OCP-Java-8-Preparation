package mock.review;

public class GoodWidget extends Widget {
    String data = "big data";

    public void doWidgetStuff() {
        System.out.println(data);
    }

    public static void sample() {
        System.out.println("Hello child");
    }
}
