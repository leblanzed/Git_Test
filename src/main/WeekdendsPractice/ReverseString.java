package src.main.WeekdendsPractice;

import org.w3c.dom.ls.LSOutput;

//How to reverse a String in java? Can you write a program without using any java inbuilt methods?
public class ReverseString {
    public static void main(String[] args) {
        String s1 = "abcdefghi";
        String s2 = "";
        for(int i = s1.length()-1; i>= 0; i--){
            s2 += s1.charAt(i);
        }
        System.out.println(s2);
    }

}
