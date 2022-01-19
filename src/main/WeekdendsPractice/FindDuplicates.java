package src.main.WeekdendsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//How to find duplicate characters in String in java?
public class FindDuplicates {
    public static void main(String[] args) {
        String s1 = "here is a new String";

        Map<Character, Integer> hashmap = new HashMap<>();
        char[] s2 = s1.toCharArray();
        for(Character cha : s2){
            if(hashmap.containsKey(cha)){
                hashmap.put(cha, hashmap.get(cha)+1);
                }else{
                hashmap.put(cha, 1);
            }
        }

        Set<Character> key = hashmap.keySet();
        for(Character cha : key){
            if(hashmap.get(cha) > 1){
                System.out.println(cha + " shows " + hashmap.get(cha) + " times");
            }
        }
    }
}
