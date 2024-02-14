package lesson7.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample2 {

    public static <K,V> V getValueByKeyFromMap(Map<K, V> map, K key){
        V result = null;
        for(Map.Entry<K, V> entry: map.entrySet()){
            if(entry.getKey().equals(key)){
                result = entry.getValue();
                break;
            }
        } return result;
    }
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Leopold");
        map.put(44, "Gleb");
        map.put(15, "Sam");
        map.put(1, "Anna");
        map.put(78, "Alisa");
        map.put(4, "Gleb");

        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        Collection<String> values = map.values();
        System.out.println(values);

        System.out.println(getValueByKeyFromMap(map, 78));
    }
}
