package Chapter1.nested_class;

public class AnnonInner {
    abstract class SaleTodayOnly {
        protected abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        AnnonInner inner = new AnnonInner();
        System.out.println(inner.admission(4));
    }
}
