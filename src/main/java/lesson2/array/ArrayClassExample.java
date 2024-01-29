package lesson2.array;

import java.util.Arrays;

public class ArrayClassExample {
    public static void main(String[] args) {
        int[] arrayInteger = new int[6];
        System.out.println(Arrays.toString(arrayInteger));
        arrayInteger[1] = 6;
        arrayInteger[4] = 3;
        System.out.println(Arrays.toString(arrayInteger));

        int[] arrayInt2 = {3, 34, 54, 34};
        System.out.println(Arrays.toString(arrayInt2));

        String[] texts = new String[4];
        String[] strings = {"One", "Two"};
        System.out.println(Arrays.toString(texts));
        System.out.println(Arrays.toString(strings));
    }
}
