package src.main.Dec13;

public class Test001 {
    public static void main(String[] args) {

        String str = new String("Marco");
        String str1 = new String("Marco");
        String str3 = "Marco";
        String str4 = str.intern();
        StringBuilder sb = new StringBuilder();


        for(int i=str.length()- 1; i >= 0; i--){
            sb = sb.append(str.charAt(i));

            System.out.println(str.charAt(i));
        }

        System.out.println(sb);
        System.out.println(sb.toString());
        sb.reverse();


//        System.out.println(str.equals(str1));
//        System.out.println(str.equals(str3));
//        System.out.println(str3.equals(str4));
//        System.out.println(str4 == str1);



    }
}
