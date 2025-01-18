package mock.review;

public class WidgetUser {
    public static void main(String[] args) {
        Widget widget = new GoodWidget();
        widget.doWidgetStuff();
        GoodWidget.sample();
        Widget.sample();
    }
}
