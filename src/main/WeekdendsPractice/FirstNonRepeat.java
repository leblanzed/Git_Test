package src.main.WeekdendsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Find first non repeated character in String in java?
//resolve this problem with set or map
public class FirstNonRepeat {
    public static void main(String[] args) {
        String s1 = "abcdasdnajfsd";
        char[] s2 = s1.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        for(Character c : s2){
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }else{
                hashMap.put(c,1);
            }
        }

        Set<Character> key = hashMap.keySet();
        for (Character cha : key){
            if(hashMap.get(cha) == 1){
                System.out.println(cha + " is the first non-duplicated character" );
                break;
            }
        }

//        for(int i = 0; i < s1.length(); i++){
//            boolean check = true;
//            for(int j  = i + 1; j < s1.length(); j++){
//                if(s1.charAt(i)== s1.charAt(j)){
//                    check = false;
//                    break;
//                }
//            }
//            if(check){
//                System.out.println("The first non-repeated char in String is "+ s1.charAt(i));
//                break;
//            }
//        }
    }
}
