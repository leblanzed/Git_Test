package src.main.Dec13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWords {
    public static void main(String[] args) {
        String str = "Tom Michale Jany";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2.reverse();
        System.out.println(str2);

        String str3 = "Tom Michale Jany Marco";
        List<String> list = Arrays.asList(str3.split(" " ));
        Collections.reverse(list);
        System.out.println(list);


    }
}
