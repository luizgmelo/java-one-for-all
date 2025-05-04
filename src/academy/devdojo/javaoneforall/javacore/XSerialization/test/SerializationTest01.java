package academy.devdojo.javaoneforall.javacore.XSerialization.test;

import academy.devdojo.javaoneforall.javacore.XSerialization.domain.Student;
import academy.devdojo.javaoneforall.javacore.XSerialization.domain.Team;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "William Souza", "123");
        Team team = new Team("Maratona Java Virado no Jiraya em Breve Ricos");
        student.setTeam(team);
        serialize(student);
        unserialize();
    }

    private static void serialize(Student student) {
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void unserialize() {
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
