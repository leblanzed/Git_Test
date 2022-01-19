package src.main.Dec22;

import java.util.ArrayList;
import java.util.List;

public class findLargest3Num {
    //get largest 3 numbers from an unsorted array without sorting the array
    public static void main(String[] args) {
        int[] arr = {43, 2, 54, 12, 22, 33, 44, 54, 27, 38, 30, 3, 11, 45, 65, 57};
        int largest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i] < largest)
                secondLargest = arr[i];
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > thirdLargest && arr[i] < secondLargest)
                thirdLargest = arr[i];
        }
        System.out.println("the largest 3 number is: "+ largest +" "+ secondLargest +" "+ thirdLargest);

    }
}
