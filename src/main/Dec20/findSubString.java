package src.main.Dec20;
//Find all substrings of String in java?
public class findSubString {
//use dynamic programming for this one
//
    public static void main(String[] args) {
        String s1 = "abcde";
        for(int i = 0; i < s1.length();i++){
            String s2 = "";
            for(int j = i; j < s1.length();j++){
                s2 += s1.charAt(j);
                System.out.println(s2);
            }
        }
    }
}
