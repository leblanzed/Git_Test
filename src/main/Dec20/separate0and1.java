package src.main.Dec20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//2.Given an array of 0’s and 1’s in random order
//you need to separate 0’s and 1’s in an array.
public class separate0and1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,0,1,1,0,0,1,1,1,0,0,1};
        List<Integer> list = new ArrayList<Integer>();
//        //the most easiest way
//        for(int i : arr){
//            list.add(i);
//        }
//       Collections.sort(list);
        for(int i = 0; i < arr.length; i++){
            if (arr[i] ==0) {
                list.add(arr[i]);
            }
        }
        int num = arr.length - list.size();
        for(int i  = 0; i< num; i++){
            list.add(1);
        }

        System.out.println(list);
    }

}
