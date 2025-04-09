package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File -> create and get information from a File
// FileWriter -> Write in a file
// FileReader -> Read in a file
// BufferedWriter -> File Writer with better performance
// BufferedReader -> FileReader with better performance
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("This is a message from DevDojo Academy for you <3\nThis is a new nice line");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
