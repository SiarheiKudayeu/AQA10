package lesson7.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        fillListWithValues(linkedList, 10000);
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        fillListWithValues(arrayList, 10000);

 /*       //getElement
        long start = System.nanoTime();
        getListElement(linkedList, 1000);
        long finish = System.nanoTime();
        System.out.println("Time to get elements from linkedList is " + (finish - start));

        long start2 = System.nanoTime();
        getListElement(arrayList, 1000);
        long finish2 = System.nanoTime();
        System.out.println("Time to get elements from arrayList is " + (finish2 - start2));*/

        //addElement middle
        long start = System.nanoTime();
        addListElementInTheMiddle(linkedList, 10000);
        long finish = System.nanoTime();
        System.out.println("Time to add elements to middle linkedList is " + (finish - start));

        long start2 = System.nanoTime();
        addListElementInTheMiddle(arrayList, 10000);
        long finish2 = System.nanoTime();
        System.out.println("Time to add elements to middle arrayList is " + (finish2 - start2));
    }

    public static void fillListWithValues(List<Integer> list, int countOfElements) {
        for (int i = 0; i < countOfElements; i++) {
            list.add(i);
        }
    }

    public static void getListElement(List<Integer> list, int countOfElements) {
        for (int i = 0; i < countOfElements; i++) {
            list.get(i);
        }

    }

    public static void addListElementInTheMiddle(List<Integer> list, int countOfElements) {
        for (int i = 0; i < countOfElements; i++) {
            list.add(15, i);
        }

    }

}
