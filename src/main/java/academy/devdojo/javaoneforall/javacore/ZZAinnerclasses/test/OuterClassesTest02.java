package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "Sasuke";

    void print(final String param) {
        final String lastName = "Uchiha";

        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName + " " + param);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("o vingador");
    }
}
