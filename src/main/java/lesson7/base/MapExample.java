package lesson7.base;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void fillMap(Map<Integer, String> map){
        map.put(5, "Leopold");
        map.put(44, "Gleb");
        map.put(15, "Sam");
        map.put(1, "Anna");
        map.put(78, "Alisa");
        map.put(4, "Gleb");
        map.put(5, "Santa");
    }

    public static void main(String[] args) {
        //HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        fillMap(hashMap);
        System.out.println(hashMap);

  /*      for(Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }*/

        //LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        fillMap(linkedHashMap);
        System.out.println(linkedHashMap);

        //TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        fillMap(treeMap);
        System.out.println(treeMap);
    }
}
