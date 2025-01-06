package Chapter9.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileAttributeExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/newFile.txt");
        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes attributes = view.readAttributes();
        System.out.println("Attributes creation time: " + attributes.creationTime());
        System.out.println("Last modified time: " + attributes.lastModifiedTime());
        System.out.println("Last accessed time: " + attributes.lastAccessTime());

        FileTime now = FileTime.fromMillis(System.currentTimeMillis());
        view.setTimes(now, now, null);
        System.out.println("Updated Access and modified times");

    }

    private static void exampleStreamFiles() {
        Path path = Paths.get("/example.java");
        try {
            Files.walk(path).filter(path1 -> path1.toString().endsWith(".java")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
