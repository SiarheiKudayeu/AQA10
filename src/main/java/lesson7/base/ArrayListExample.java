package lesson7.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        //integerArrayList.ensureCapacity(7);


        //add
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        System.out.println(stringList);

        //toArray()
        Object[] objects = stringList.toArray();
        System.out.println(Arrays.toString(objects));

        //size(), get()
        System.out.println("Length of the arrayList " + stringList.size());
        System.out.println("Second element is \"" + stringList.get(1) + "\"");

        for(String word: stringList){
            System.out.println(word);
        }

        //remove()
        stringList.remove(1);
        System.out.println(stringList);

        //set()
        stringList.set(1, "Two");
        System.out.println(stringList);

        String[] s = {"1", "3"};
        List<Integer> integers = new ArrayList<>(Arrays.asList(2,3,4,5));
        System.out.println(integers);

        //contains
        System.out.println(stringList.contains("Two"));
        System.out.println(stringList.contains("Twow"));

        ArrayList<Integer> integerArrayList = new ArrayList<>(5);
        integerArrayList.add(3);
        integerArrayList.add(3);
        integerArrayList.add(3);
        integerArrayList.add(3);
        System.out.println("========");
        System.out.println(integerArrayList);
        integerArrayList.ensureCapacity(1);
        System.out.println(integerArrayList);

        //
        integerArrayList.trimToSize();
        System.out.println(integerArrayList);

        //[3, 3, 3, 3]



    }
}
