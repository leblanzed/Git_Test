package src.main.InClassImp;

public class CheckUnorderedOcc {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5,6,6,7,7,7};

        for(int i = 0; i < arr.length; i++){
        }


        for(int i = 0; i < arr.length;i++){
            int target = arr[i];
            int occFrequency = 0;

            for(int j = 0; j < arr.length;j++){
                if(arr[j] == target){
                    occFrequency++;
                }

            }

        }
    }

}
