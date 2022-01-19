package src.main.Dec7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DescendingSort {

    //create list with random values,
    //then sorting descending order with object
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(8);

        arrayList.sort(Collections.reverseOrder());

        for(int a : arrayList){
            System.out.println(a);
        }

    }

}
