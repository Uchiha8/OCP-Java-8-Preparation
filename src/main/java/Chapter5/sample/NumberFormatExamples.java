package Chapter5.sample;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExamples {
    public static void main(String[] args) {
        Locale locale = new Locale("kz", "KZ");
        NumberFormat format = NumberFormat.getInstance();
        NumberFormat formatLocal = NumberFormat.getInstance(locale);

        NumberFormat general = NumberFormat.getNumberInstance();
        NumberFormat generalLocal = NumberFormat.getNumberInstance(locale);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat currencyLocal = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyLocal.getCurrency());
    }
}
