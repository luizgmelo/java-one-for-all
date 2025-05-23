package academy.devdojo.javaoneforall.introduction;

public class Class05IF {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado");
        }
    }
}
