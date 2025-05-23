package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();


        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAccess = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(null, newLastAccess,null);

        creationTime = basicFileAttributes.creationTime();
        lastModifiedTime = basicFileAttributes.lastModifiedTime();
        lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);
    }
}
