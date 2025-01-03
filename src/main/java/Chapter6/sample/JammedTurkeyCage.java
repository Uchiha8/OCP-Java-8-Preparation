package Chapter6.sample;

import java.io.FileNotFoundException;

public class JammedTurkeyCage implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {

    }
}
