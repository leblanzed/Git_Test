package src.main.Dec9;
//NullPointerException,NumberFormatException,ArrayIndexOutOfBoundsException
public class ThreeException {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String a = null;
        String b = "Hello World";

        try {
            System.out.println(a.length());
        } catch (NullPointerException e1) {
            System.out.println("NullPointerException " + e1);
        }try{
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ArrayIndexOutOfBoundsException " + e2);
        }try {
            {
            int i = Integer.parseInt(b);
            }
        }catch (NumberFormatException e3){
            System.out.println("NullPointerException " + e3);
        }
    }
}
