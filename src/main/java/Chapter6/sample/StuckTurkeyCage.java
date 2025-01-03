package Chapter6.sample;

import java.io.IOException;

public class StuckTurkeyCage implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }

    public static void main(String[] args) throws Exception {
        try (StuckTurkeyCage stuckTurkeyCage = new StuckTurkeyCage()) {
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println("Catched ");
        }
    }
}
