package Chapter9.sample;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.EnumSet;

public class Sample {
    private static void example1() {
        Path path = Paths.get("example.txt");
        System.out.println("Path: " + path);
        System.out.println("Absolute path: " + path.toAbsolutePath());
        System.out.println("IsAbsolutePath: " + path.isAbsolute());
        System.out.println("File name: " + path.getFileName());
        try {
            if (Files.isSymbolicLink(path)) {
                System.out.println(path + " is a symbolic link");
                System.out.println("Real Path: " + Files.readSymbolicLink(path));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void example2() {
        FileSystem fileSystem = FileSystems.getDefault();
        System.out.println(fileSystem);

        Path path1 = fileSystem.getPath("example.txt");
        Path path2 = Paths.get("example.txt");

        File pathToFile = path1.toFile();
        URI pathToURI = path2.toUri();
        System.out.println(pathToFile);
        System.out.println(pathToURI);
    }

    private static void example3() {
        Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.txt");
        Path path2 = FileSystems.getDefault().getPath("c:", "zooInfo", "November");
        Path path3 = FileSystems.getDefault().getPath("/home/zooDirector");

        FileSystem fileSystem = null;
        try {
            fileSystem = FileSystems.getFileSystem(new URI("https://www.selifok.net"));
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void example4() {
        Path path = Paths.get("shortcut.txt");
        Path copy_path = Paths.get("shortcut_copy.txt");
        try {
            Files.copy(path, copy_path, LinkOption.NOFOLLOW_LINKS);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Path start = Paths.get("directory_link");
    }

    public static void main(String[] args) {
        example3();
    }
}
