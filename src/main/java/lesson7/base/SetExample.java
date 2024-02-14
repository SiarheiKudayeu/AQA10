package lesson7.base;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void fillSet(Set<String> set){
        set.add("auto");
        set.add("car");
        set.add("helicopter");
        set.add("boat");
        set.add("plane");
        set.add("cycle");
        set.add("auto");
    }

    public static void main(String[] args) {
        //HashSet doesn't  guarantee order:
        Set<String> hashSet = new HashSet<>();
        fillSet(hashSet);
        System.out.println(hashSet);
        System.out.println("=======");

        //LinkedHashSet guarantee order:
        Set<String> linkedSet = new LinkedHashSet<>();
        fillSet(linkedSet);
        System.out.println(linkedSet);
        System.out.println("=======");

        //TreeSet order by
        Set<String> treeSet = new TreeSet<>();
        fillSet(treeSet);
        System.out.println(treeSet);

    }
}
