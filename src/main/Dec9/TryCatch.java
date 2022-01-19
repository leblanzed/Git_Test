package src.main.Dec9;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of the bounders");
        }finally {
            System.out.println("No matter what, finally will be executed");
        }
    }
}
