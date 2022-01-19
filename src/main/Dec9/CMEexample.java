package src.main.Dec9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//concurrent modification exception example
public class CMEexample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add( "1" );
        myList.add( "2" );
        myList.add( "3" );
        myList.add( "4" );
        myList.add( "5" );
//        List two will is the concurrent modification exception example
//        for (String value : myList) {
//            if (value.equals("3"))
//                myList.remove(value);  // error
//        }

//        for (Iterator<String> it = myList.iterator(); it.hasNext();) {
//            String value = it.next();
//            if (value.equals( "3" )) {
//                myList.remove(value);  // error
//            }
//        }

//        List is the correct way to do this remove
//        for (Iterator<String> it = myList.iterator(); it.hasNext();) {
//            String value = it.next();
//            if (value.equals( "3" ))
//                it.remove();  // ok
//        }




    }
}



