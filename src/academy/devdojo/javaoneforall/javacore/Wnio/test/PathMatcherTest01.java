package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("folder/subfolder1/file.txt");
        Path path2 = Paths.get("folder/subfolder1/Arquivo.java");
        matches(path1, "glob:**/*.txt");
        matches(path2, "regex:.*\\.java");
    }

    private static void matches(Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
