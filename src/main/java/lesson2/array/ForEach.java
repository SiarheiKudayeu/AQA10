package lesson2.array;

import java.util.Arrays;
import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int[] arrayInt2 = new int[5];
        //for
        for (int i = 0; i < arrayInt2.length; i ++){
            arrayInt2[i] = randomizer.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(arrayInt2));

        //for each
        System.out.print("[");
        for (int number: arrayInt2){
            number = 10;
            System.out.print(number + ", ");
        }
        System.out.print("\b\b]");

        System.out.println("\n" + Arrays.toString(arrayInt2));
    }
}
