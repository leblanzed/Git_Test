package src.main.WeekdendsPractice;

import java.util.*;

//Write a program to check if String has all unique characters in java?
public class CheckUnique {

    boolean checkIfUnique(String str){
        for(int i = 0; i < str.length();i++){
            for(int j = i + 1; j < str.length();j++){
                if(str.charAt(i) == str.charAt(j))
                    return false ;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        CheckUnique obj = new CheckUnique();
        String input = "abcdefg";

        if(obj.checkIfUnique(input))
            System.out.println(input + " are all unique characters");
        else
            System.out.println(input + " included duplicated characters");
    }
}

