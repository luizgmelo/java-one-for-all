package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
