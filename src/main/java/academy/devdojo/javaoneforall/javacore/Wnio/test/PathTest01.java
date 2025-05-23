package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/guilherme/Projects/personal/java-one-for-all/java-one-for-all.iml");
        Path p2 = Paths.get("/home/guilherme/Projects/personal/java-one-for-all","java-one-for-all.iml");
        Path p3 = Paths.get("home", "guilherme", "Projects", "personal", "java-one-for-all", "java-one-for-all.iml");
        System.out.println(p1.getFileName().toFile());
        System.out.println(p2.getFileName().toFile());
        System.out.println(p3.getFileName().toFile());
    }
}
