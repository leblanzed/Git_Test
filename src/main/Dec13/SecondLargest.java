package src.main.Dec13;

import java.util.Arrays;

// Find second largest number in an array?
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,65,234,889,889,43,9,12,31,2,3};
        int largest = arr[0];
//        int second  = arr[0];
//
//        for(int i=1; i< arr.length; i++)
//        {
//            if(arr[i] > largest)
//                largest = arr[i];
//        }
//
//        for(int i=1; i< arr.length; i++)
//        {
//            if(arr[i] > second && arr[i] < largest)
//                second = arr[i];
//        }
//        System.out.println(second);
        Arrays.sort(arr);
        for(int i = arr.length - 2;i >= 0; i--){
            if(arr[i] != arr[arr.length-1]){
                System.out.println(arr[i]);
                break;

            }
        }
    }
}

