package lesson6.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleExceptionArrayClass2 {
    public static void main(String[] args) {
        int[] array = {12, 3, 35, 0, 55};
        System.out.println("Insert index of array: ");
        try {
            System.out.println(100 / array[new Scanner(System.in).nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("All is OK!!!");

    }
}
