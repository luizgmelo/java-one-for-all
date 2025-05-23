package academy.devdojo.javaoneforall.introduction;

/*
    Create variables for the fields described below between <> and print the following message:

    I <name>, living at <address>, confirm that I received the salary of <salary> on <date>
*/

public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Kirito";
        String address = "439 East District";
        double salary = 5420.21;
        // dd/MM/yyyy
        String receivedSalaryDate = "01/04/2025";
        String report = "I " + name + ", living at " + address + ", confirm that I received the salary of " + salary + " on " + receivedSalaryDate;
        System.out.println(report);
    }
}
