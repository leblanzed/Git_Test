package src.main.WeekdendsPractice;
//check string palindrome ?
public class Palindrome {
    public static void main(String[] args) {
        String s1 = "abcdeffedcba";
        StringBuffer s2 = new StringBuffer();
        for(int i = s1.length()-1; i>=0;i--){
            s2.append(s1.charAt(i));
        }

        if(s1.contentEquals(s2)){
            System.out.println(s1+" is");
        }else{
            System.out.println(s1 + " is not");

        }

    }
}
