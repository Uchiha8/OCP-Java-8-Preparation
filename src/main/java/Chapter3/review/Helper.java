package Chapter3.review;

import java.io.FileNotFoundException;

public class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        // here you need to add code
    }
}
