package src.main.Dec21;
//Separate odd and even numbers in an array
public class separateOddAndEven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        int evenArraySize = 0, oddArraySize = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 ==0)
                evenArraySize++;
            else
                oddArraySize++;
        }
        int[] evenArr = new int[evenArraySize];
        int[] oddArr = new int[oddArraySize];
        int even = 0, odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                evenArr[even++] = arr[i];
            else
                oddArr[odd++] = arr[i];
        }

        for(int i : evenArr){
            System.out.println(i);
        }
        for(int i : oddArr){
            System.out.println(i);
        }
    }
}
