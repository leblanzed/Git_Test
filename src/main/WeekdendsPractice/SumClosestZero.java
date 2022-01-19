package src.main.WeekdendsPractice;
//Find a Pair Whose Sum is smallest in Array
//Find the min/max of the second min/max in Array
//Find the min/second min in Array in one loop
//write down the time complexity of them
public class SumClosestZero {
    public static void main(String[] args) {
        int[] arr = {11,65,32,76,43,9,12,76,4};
        int a = 0, b = 0;
        int tempMin = arr[0] + arr[1];
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length;j++){
                int sum = arr[i] + arr[j];
                if(tempMin > sum){
                    tempMin = sum;
                    a =i;
                    b =j;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to zero : "+arr[a]+" "+ arr[b] );
    }

}
