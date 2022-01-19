package src.main.Dec13;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s1 = "abcddcba";
        StringBuilder s2 = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2.append(s1.charAt(i));
        }

        if(s1.contentEquals(s2)){
            System.out.println("it is a palindrome String");
        }else{
            System.out.println("it is not a palindrome String");
        }
    }
}
