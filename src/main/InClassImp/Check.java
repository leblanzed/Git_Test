package src.main.InClassImp;
import java.util.function.Predicate;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("please enter the number you want to check:");
        int numb = s.nextInt();

        System.out.println("please enter the String you want to check:");
        String word = s.next();


        Predicate<Integer> pre = number -> (numb/2) == 0;
        System.out.println(pre.test(numb));
        System.out.println("true means even, false means odd");
        System.out.println("--------------------------------");


        Predicate<String> pre2 = string -> word.length()>4;
        System.out.println(pre2.test(word));
        System.out.println("true means string length greater than 4, false means less than 4");
        System.out.println("--------------------------------");

        Predicate<String> pre3 = string -> word.length() == 0;
        System.out.println(pre3.test(word));
        System.out.println("true means empty string, false means not empty string");
        System.out.println("--------------------------------");


    }
}
