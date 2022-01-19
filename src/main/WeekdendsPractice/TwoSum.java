package src.main.WeekdendsPractice;

import java.util.HashSet;
import java.util.Map;

//Find all pairs of elements from an non-negative array whose sum is equal to given number
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 10;

        HashSet<Integer>hashSet = new HashSet<Integer>();
        for(int i = 0; i < arr.length;i++){
            int tem = target - arr[i];
            if(hashSet.contains(tem)){
                System.out.println("Pair whose sum is equal to " + target
                + " is "+ arr[i] +" "+ tem);
            }
            hashSet.add(arr[i]);
        }

    }
}
