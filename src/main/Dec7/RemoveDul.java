package src.main.Dec7;

import java.util.*;

public class RemoveDul {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3, 5));

        // convert the arrayList into a HashSet, because HashSet can not have the duplicate elements
        Set<Integer> set = new LinkedHashSet<>(list);
//        System.out.println(set);
        // delete al elements of arrayList
        list.clear();;
        // add element from set to arrayList
        list.addAll(set);
        Collections.reverse(list);
        System.out.println(list);
    }
}

