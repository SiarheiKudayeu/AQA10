package lesson6.ex1;

import lesson3.bearex.Bear;
import lesson5.generics.ex1.SimpleBox;

import java.util.Scanner;

public class ExceptionExampleClass1 {
    public static void main(String[] args) {
        /*//ArithmeticException
        System.out.println(14/0);*/


/*        //ArrayIndexOutOfBoundsException
        int[] array = new int[3];
        System.out.println(array[1000]);*/



/*        //ClassCastException
        SimpleBox intSimpleBox1 = new SimpleBox(25);
        SimpleBox intSimpleBox2 = new SimpleBox("25");
        System.out.println((Integer)intSimpleBox1.getObject() + (Integer)intSimpleBox2.getObject());*/

/*        //NullPointerException
        Bear bear = null;
        bear.getInfo();*/
        int x = 15;
        System.out.println("Insert number:");
        int y = new Scanner(System.in).nextInt();
        try {
            System.out.println("result of division is: " + x/y);
            System.out.println("After division");
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("In any case!!!!");
        }

        System.out.println("to be continued!!!!");

/*        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

    }
}
