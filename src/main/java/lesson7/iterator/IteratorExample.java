package lesson7.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        Iterator<String> iterator = stringList.iterator();
        //
        while (iterator.hasNext()){
            if(iterator.next().equals("Two")){
                iterator.remove();
            }
        }

        System.out.println(stringList);

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("One");
        stringList2.add("Two");
        stringList2.add("Three");
        ListIterator<String> listIterator = stringList2.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equals("Two")){
                listIterator.set("after Two");
            }
        }
        System.out.println(stringList2);
    }
}
