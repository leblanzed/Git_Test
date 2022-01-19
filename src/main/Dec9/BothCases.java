package src.main.Dec9;

public class BothCases {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String a = null;
        String b = "Hello World";

        try {
            System.out.println(a.length());
        } catch (NullPointerException e1) {
            System.out.println("NullPointerException " + e1);
        } finally {
            System.out.println("This is finally block one");
        }
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundsException " + e2);
        }finally {
            System.out.println("This is finally block two");
        }
    }
}
