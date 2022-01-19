package src.main.Dec7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintEven {

    public static void main(String[] args) {
        //add 1 - 50 to a list
        List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 50; i++){
                list.add(i);
            }
        //use iterator to sort out the even number
        Iterator<Integer> it = list.iterator();
             while (it.hasNext()){
             int a = it.next();
              if(a % 2 ==0){
                  System.out.println(a);
               }

             }
    }

}
