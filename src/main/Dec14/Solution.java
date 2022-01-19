package src.main.Dec14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> findSeq(String s){
        final List<String> result = new ArrayList<>();
        if(s.length() < 10)
            return result;
        final Map<String, Integer> counter = new HashMap<>();
        for(int i = 0; i < s.length() -9; ++i){
            final String key = s.substring(i,i+10);
            int value = counter.getOrDefault(key,0);
            counter.put(key,value+1);
        }
        for(Map.Entry<String, Integer> entry : counter.entrySet()){
            if(entry.getValue() > 1){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        a.findSeq("AAAABBBBCCDDDAAAABBBCCC");
    }
}
