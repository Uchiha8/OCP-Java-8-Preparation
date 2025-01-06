package Chapter9.sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class AvoidCircularPaths {
    public static void main(String[] args) {
        Path startPath = Paths.get("C:/example/java");
        System.out.println("without following the link");
        try (Stream<Path> stream = Files.walk(startPath)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error traversing the directory: "+e.getMessage());
        }
        System.out.println("With FOLLOW_LINK optional parameter");
        try (Stream<Path> stream = Files.walk(startPath, FileVisitOption.FOLLOW_LINKS)) {
            stream.forEach(System.out::println);
        } catch (FileSystemLoopException e) {
            System.out.println("Cycle detected: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error traversing the directory: " + e.getMessage());
        }
    }

    private static void task1() {
        Path path = Paths.get("example.java");
        long dateTime = 17162317351l;
        try {
            Stream<Path> stream = Files.find(path, 10,
                    (p, a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateTime);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
