package Chapter5.sample;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ZooOpen {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale fr = new Locale("fr", "FR");
        printProperties(us);
        System.out.println();
        printProperties(fr);

        ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", us);
        Set<String> keys = resourceBundle.keySet();
        keys.stream().map(k -> k + " " + resourceBundle.getString(k)).forEach(System.out::println);
        Properties properties = new Properties();
        resourceBundle.keySet().stream().forEach(k -> properties.put(k, resourceBundle.getString(k)));
        System.out.println(properties.toString());
        System.out.println();
        System.out.println();
        System.out.println(properties.getProperty("notreallyproperty"));
        System.out.println(properties.getProperty("hello","123"));

    }

    private static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));


    }
}
