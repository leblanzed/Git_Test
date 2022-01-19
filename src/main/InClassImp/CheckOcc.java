package src.main.InClassImp;

import java.util.HashMap;
import java.util.Map;

public class CheckOcc {
    public static void main(String[] args) {
       int[] arr = {1,1,2,3,3,3,4,5,6,6,7,8,8,9,9,10};

        Map<Integer,Integer> hashMap = new HashMap<>();
        for(Integer num : arr){
            Integer count = hashMap.get(num);

            if(count == null){
                hashMap.put(num,1);
            }else{
                hashMap.put(num,count+1);
            }
        }
        System.out.println(hashMap);

    }
}
