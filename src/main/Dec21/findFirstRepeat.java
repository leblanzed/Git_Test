package src.main.Dec21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Find first repeating element in an array of integers.
public class findFirstRepeat {
    public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 5, 5, 4};
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(Integer i : arr){
            if(hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i)+1);
            }else{
                hashMap.put(i,1);
            }
        }

        Set<Integer> key = hashMap.keySet();
        for (Integer i : key){
            if(hashMap.get(i) != 1){
               System.out.println(i + " is the first repeated number" );
               break;
            }
        }
//        HashSet<Integer> set = new HashSet<Integer>();
//        for (int i : arr) {
//            if (set.contains(i)) {
//                System.out.println(i);
//                break;
//            }
//            set.add(i);
//        }
    }
}
