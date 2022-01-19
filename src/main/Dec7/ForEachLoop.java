package src.main.Dec7;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {
        List<String> courseList = Arrays.asList("Math", "English", "Art", "PE", "Chemistry");


        for (Iterator it = courseList.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        System.out.println("=====above use iterator to check for each=====");

        for (String b : courseList) {
            System.out.println(b);
        }
        System.out.println("=====above use normal way for each check=====");

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i);
        }

        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("=====above use normal way for each check=====");


    }

}

