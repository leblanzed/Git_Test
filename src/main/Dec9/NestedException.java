package src.main.Dec9;

public class NestedException {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try{
            for(int i = 6; i < arr[5];i++ )//parent exception is a RuntimeException
            try {
                try {
                    System.out.println(arr[10]);//inner exception is an ArrayIndexOfBoundsException
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException" + e);
                }
            } catch (ArithmeticException e2) {
                System.out.println("ArithmeticException" + e2);
            }
        }catch(RuntimeException e3){
            System.out.println("RuntimeException" + e3 );
    }finally{
            System.out.println("This finally always executed");
        }


}







}