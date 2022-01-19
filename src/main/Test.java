package src.main;

public class Test {

    public static int maxWater(int[] arr, int n) {
        int res = 0;
        for(int i = 1; i < n - 1; i++) {
            // Find highest bar on its left
            int left = arr[i];
            for(int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            // Find highest bar on its right
            int right = arr[i];
            for(int j = i + 1; j < n; j++) {
            right = Math.max(right, arr[j]);
            }
            // Update maximum water
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

    public static void main(String[] args){
    int[] arr = { 2, 1, 2};
    int n = arr.length;
    System.out.print(maxWater(arr,n));
    }
}
