package src.main.Dec8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

//Implementation of comparator where order of insertion will be preserved.
public class Test003 {
    static class CustomSorting implements Comparator {


        @Override
        public int compare(Object o, Object t1) {
            Integer i1 = (Integer) o;
            Integer i2 = (Integer) t1;
            return i1.compareTo(i2);
        }
    }

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>(new CustomSorting());
        set.addAll(Arrays.asList(1,2,3,4,5));
        set.addAll(Arrays.asList(11,12,13,14,15));
        System.out.println(set);
    }


}


