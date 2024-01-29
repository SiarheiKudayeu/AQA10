package lesson2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner myHelperToSendKeys = new Scanner(System.in);
/*        System.out.println("Insert some number:");
        int x = myHelperToSendKeys.nextInt();
                System.out.println(x);*/


        /*System.out.println("Insert some text:");
        String text = myHelperToSendKeys.nextLine();
        System.out.println(text);*/

        System.out.println("Insert text:");
        String text = myHelperToSendKeys.next();
        String text2 = myHelperToSendKeys.next();
        System.out.println(text);
        System.out.println(text2);

        myHelperToSendKeys.close();
    }
}
