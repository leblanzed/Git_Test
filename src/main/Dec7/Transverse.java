package src.main.Dec7;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Transverse {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");

        ListIterator it = list.listIterator(list.size());

        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
