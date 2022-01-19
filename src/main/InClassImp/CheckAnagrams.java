package src.main.InClassImp;

import java.util.Arrays;

public class CheckAnagrams {
    static void check(String s1, String s2){

        if(s1.length() == s2.length()){
         char[] c1 = s1.toCharArray();
         char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            
            boolean result = Arrays.equals(c1, c2);
            if(result){
                System.out.println(s1+ " and " +s2 +" are anagrams");
            }else{
                System.out.println(s1+ " and " +s2 +" are not anagrams");
            }
        }else{
            System.out.println(s1+ " and " +s2 +" are not anagrams");
        }
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cbadj";
        check(s1,s2);
    }
}
