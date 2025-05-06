package academy.devdojo.javaoneforall.javacore.XSerialization.domain;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = 7305375818826952457L;
    private Long id;
    private String name;
    private transient String password;
    private final String SCHOOL_NAME = "Dev Dojo Academy";
    private transient Team team;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oss) {
        try {
            oss.defaultWriteObject();
            oss.writeUTF(team.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nameTeam = ois.readUTF();
            team = new Team(nameTeam);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOLL_NAME='" + SCHOOL_NAME + '\'' +
                ", TEAM='" + team + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
