package Chapter8.sample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyTextFileSample {
    public static void main(String[] args) {
        try {
            File source = new File("file1.txt");
            File destination = new File("file2.txt");
            List<String> data = readFile(source);
            for (String records : data) {
                System.out.println(records);
            }
            writeFile(data, destination);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                data.add(s);
            }
        }
        return data;
    }

    private static void writeFile(List<String> data, File destination) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            for (String s : data) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        }
    }

}
