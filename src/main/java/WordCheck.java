import java.util.HashMap;
import java.util.Map;

public class WordCheck {
    public static void main(String[] args) {
        String str = "this is is a test test test class";
        Map<String,Integer> hashMap = new HashMap<>();

        //sorting them in string
        String[] words = str.split(" ");

        for(String word : words){
            Integer count  = hashMap.get(word);

            if(count == null){
                hashMap.put(word,1);
            }else{
                hashMap.put(word,count+1);
            }
        }
        System.out.println(hashMap);
    }
}
