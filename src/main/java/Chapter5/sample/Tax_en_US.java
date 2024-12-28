package Chapter5.sample;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Tax_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "sample.Tax", Locale.US
        );
        System.out.println(rb.getObject("tax"));
    }
}
