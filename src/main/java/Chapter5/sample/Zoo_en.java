package Chapter5.sample;

import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {
                "hello", "Hello"
            },
            {
                "open", "The zoo is open"
            }
        };
    }

}
