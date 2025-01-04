package Chapter8.sample;

import java.io.*;
import java.util.Date;

public class FileExamples {

    private static void example1() {
        File file = new File("src/main/resources/example.txt");
        System.out.println(file.exists());
    }

    private static void example2() {
        try {
            File parentPath = new File("src/main/resources");
            File file = new File(parentPath, "newFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

    private static void example3() {
        File directory = new File("src/main/resources");
        if (directory.isDirectory()) {
            String[] listFiles = directory.list();
            System.out.println("Contents of directory");
            for (String s : listFiles) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("This is not directory");
        }
    }

    private static void example4() {
        File file1 = new File("src/main/resources/example.txt");
        if (file1.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exists");
        }
        System.out.println(file1.getName());
        System.out.println(file1.getAbsoluteFile());

        File dir = new File("src/main/resources/hello");
        if (dir.isDirectory()) {
            System.out.println("It is a directory.");
        } else {
            System.out.println("it is not a directory");
        }
        if (dir.isFile()) {
            System.out.println("It is a file");
        } else {
            System.out.println("it is not a file");
        }
        if (file1.isFile()) {
            System.out.println("it is a file");
        } else {
            System.out.println("It is not a file");
        }
        System.out.println(file1.length());
        System.out.println("Last Modified: " + new Date(file1.lastModified()));

        File oldName = new File("scr/main/resources/newFile.txt");
        File newName = new File("scr/main/resources/hello/renamedFile.txt");
        if (oldName.exists() && newName.exists()) {
            System.out.println("File renamed");
        } else {
            System.out.println("Failed");
        }

        File newDir = new File("src/main/resources/newDirectory");
        if (newDir.mkdir()) {
            System.out.println("Created new dir");
        } else {
            System.out.println("Failed to create directory");
        }
        File newDirs = new File("src/main/resources/parent");
        if (newDirs.mkdirs()) {
            System.out.println("Created parent and child dir");
        } else {
            System.out.println("failed to create dirs");
        }

        try {
            File file = new File("src/main/resources/hello/newFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
                System.out.println(file.getParent());
            }
        } catch (IOException e) {
            System.out.println("Failed to create a file");
            e.printStackTrace();
        }
    }

    private static void example5() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/hello/newFile.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void example6(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    private static void example7(File source, File destination) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] bytes = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(bytes)) > 0) {
                out.write(bytes, 0, lengthRead);
                out.flush();
            }
        }
    }

    private static void example8() throws IOException {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello world");
            writer.flush();
        }
    }

    private static void example9() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }



    public static void main(String[] args) {
        File source = new File("src/main/java/Chapter8/sample/Zoos.java");
        File destination = new File("src/main/java/Chapter8/review/ZooCopy.java");
        try {
            example6(source, destination);
        } catch (IOException e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}
