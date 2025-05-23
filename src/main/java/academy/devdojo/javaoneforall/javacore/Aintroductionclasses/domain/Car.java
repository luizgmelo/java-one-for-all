package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain;

public class Car {
    public String name;
    public String model;
    public int year;

    public void print() {
        System.out.println("------------");
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.year);
    }
}
