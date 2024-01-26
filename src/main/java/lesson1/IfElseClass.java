package lesson1;

public class IfElseClass {

/*     if(условие){
     выполнение кода если условие = true
     }
     */

    public static void main(String[] args) {
        int x = 500;
        if (x > 0) {
            if(x == 500){
                System.out.println("Your number is 500");
            } else {
                System.out.println("Your number is positive");
            }
        } else if(x < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is zero");
        }
    }
}
