package src.main.Dec8;

import java.util.Comparator;
import java.util.TreeSet;

//Sorting on basis of length of string (ascending order)
public class Test004 {
    static class CustomSorting implements Comparator {


        @Override
        public int compare(Object o, Object t1) {
            String i1 = (String) o;
            String i2 = (String) t1;
            return i1.length() - i2.length();
        }
    }

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>(new CustomSorting());
        set.add("123456");
        set.add("123");
        set.add("12345");
        set.add("1");
        set.add("1");
        set.add("12");
        set.add("1234");
        set.add("abcdefghi");
        System.out.println(set);
    }
}
