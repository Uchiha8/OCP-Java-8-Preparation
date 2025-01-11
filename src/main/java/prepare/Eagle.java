package prepare;

import java.io.IOException;

public class Eagle implements Fly {
    @Override
    public int getWingSpan() throws RuntimeException {
        return 14;
    }

    public void land() {
        System.out.println("land hello");
    }
}
