package src.main;

public class FindLeader {
    public static void main(String[] args) {
        int[] arr = {15, 16, 3, 2, 6, 1, 4 };
        //O(n^2)
//        for(int i = 0; i<arr.length;i++){
//            int j;
//            for(j = i+1; j <arr.length;j++){
//                if(arr[i]<= arr[j])
//                    break;
//            }if(j == arr.length){
//                System.out.println(arr[i] + " is the leader ");
//            }
//        }
        //O(n)
        int mostRight = arr.length -1;
        System.out.println(arr[mostRight]);
        for(int i = arr.length-2; i>=0;i--){
            if(arr[mostRight] < arr[i]){
                arr[mostRight] = arr[i];
                System.out.println(arr[mostRight]);
            }
        }
    }
}
