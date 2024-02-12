package lesson6.generate_exception2;

import lesson6.generate_exception.PersonException;

public class MainCheckExceptionClass {
    public static void main(String[] args) throws Example2.ContainsWordException {
        Example2 example2 = new Example2();
        try {
            example2.checkString4("Textw");
        } catch (Example2.ContainsWordException | Example2.CountOfWordException | Example2.OddLengthException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Next");

        //new PersonException().openMainPage();



     /*   try {
            example2.checkString4("Text text textx");
        } catch ( Example2.CountOfWordException | Example2.OddLengthException e){
            System.out.println(e.getMessage());
        }*/

    }
}
