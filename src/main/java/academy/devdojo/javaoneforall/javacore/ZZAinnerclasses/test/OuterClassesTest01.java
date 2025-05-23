package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Midoriya Izuku";
    // Nested
    class Inner {
        public void print() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outer = new OuterClassesTest01();
        Inner inner1 = outer.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();

        inner1.print();
        inner2.print();
    }
}
