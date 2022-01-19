package src.main.Dec8;

//1.Perform descending of integer values using custom comparator
import java.util.Comparator;
import java.util.TreeSet;

public class Test001 {
    static class CustomSorting implements Comparator{


        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            if(i1 > i2)
                return -1;
            else if(i1 < i2)
                return 1;
            else
                return 0;
        }
    }



    public static void main(String[] args) {
        TreeSet set = new TreeSet(new CustomSorting());
        set.add(3);
        set.add(10);
        set.add(3);
        set.add(1);
        set.add(8);
        set.add(5);
        System.out.println(set);
    }
}
