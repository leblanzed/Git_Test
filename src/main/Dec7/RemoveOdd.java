package src.main.Dec7;

import java.sql.SQLOutput;
import java.util.*;

public class RemoveOdd {

    public static void main(String[] args) {

        //add 1 - 50 to a list
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 50; i++){
            list.add(i);
        }
        ListIterator<Integer> it = list.listIterator();
        //remove odd number
        while (it.hasNext()){
            int a = it.next();
            if(a % 2 == 1 ){
                it.remove();
            }
            if(a % 10 == 0){
                it.add(100);
            }
            System.out.println(it.next());

        }
    }
}

