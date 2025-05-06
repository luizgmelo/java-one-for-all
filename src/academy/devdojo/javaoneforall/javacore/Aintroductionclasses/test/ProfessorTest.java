package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.gender = 'M';
        System.out.println("Nome: " + professor.name + " Idade: " + professor.age + " Sexo: " + professor.gender);
    }
}
