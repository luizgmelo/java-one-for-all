package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            folderPath = Files.createDirectory(folderPath);
        }
        Path subFolderPath = Paths.get("folder/subfolder/subfolder2");
        subFolderPath = Files.createDirectories(subFolderPath);

        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            filePath = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(filePath, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
