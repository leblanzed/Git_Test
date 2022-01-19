package src.main.Dec7;

import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    //sort map basis values

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "c");
        map.put(4, "d");
        map.put(2, "b");
        map.put(1, "a");
        map.put(6, "f");
        map.put(5, "e");

        //sorted by its key
        System.out.println(map.values());

        for (Integer key : map.keySet()) {
//            System.out.println(key);
            System.out.println(key);
        }

    }
}
