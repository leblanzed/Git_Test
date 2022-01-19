package src.main.Dec13;

import java.util.HashMap;

//Find the number occurring odd number of times in an array?
public class OccurringOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,4,4};

        HashMap<Integer,Integer> map = new HashMap<>();
        //Putting all elements into the HashMap
        for (int value : arr) {
            //if the element show more than 1th, paired value count one
            if (map.containsKey(value)) {
                int count = map.get(value);
                map.put(value, count + 1);
            } else {
                map.put(value, 1);
            }
        }
        // Checking for odd occurrence of each element present
        // inside of the HashMap
        for (Integer a : map.keySet()) {
            if(map.get(a) %2 != 0)
                System.out.println(a);
        }
    }
}
