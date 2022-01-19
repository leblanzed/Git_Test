package src.main.Dec8;

import java.util.Comparator;
import java.util.TreeSet;

//Perform reverse order of alphabetical for string values using custom comparator
public class Test002 {
    static class CustomSorting implements Comparator {


        @Override
        public int compare(Object o, Object t1) {
            String i1 = (String) o;
            String i2 = (String) t1;
            return i2.compareTo(i1);
        }
    }

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>(new CustomSorting());
        set.add("A");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("C");
        set.add("B");
        System.out.println(set);
    }

}
