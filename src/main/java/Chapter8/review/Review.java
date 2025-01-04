package Chapter8.review;

import java.io.*;

public class Review {
    private static void task1() {
        try {
            InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        InputStream wrapper;
    }

    private static void task2(File file) {
        if (!file.isFile()) {
            for (File entry : file.listFiles()) {
                task2(entry);
            }
        } else {
            file.delete();
        }
    }


    public static void main(String[] args) {

    }
}
