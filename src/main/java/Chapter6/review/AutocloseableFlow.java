package Chapter6.review;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutocloseableFlow {
    static class Door implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("D");
            throw new IOException();
        }
    }

    static class Window implements Closeable {
        @Override
        public void close() throws IOException {
            System.out.println("W");
            throw new FileNotFoundException();
        }
    }

    public static void main(String[] args) throws Exception{
        try (Door d = new Door(); Window w = new Window()) {
            System.out.println("T");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
    }
}
