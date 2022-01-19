import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {80, 81, 84, 85, 87, 95};
        Arrays.sort(array);

            for(int i = 1; i<array.length;i++) {
                if(array[i] - array[i - 1] == 2)
                    System.out.println(array[i]-1);
                else if (array[i] - array[i-1] == 3)
                    System.out.println((array[i] -1) +" "+ (array[i] -2));
                else if (array[i] - array[i-1] >= 4)
                    System.out.println("too many missing number between "+ array[i] +" "+ array[i-1]);
            }
        }
}