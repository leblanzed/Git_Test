package src.main.Dec13;

public class PrintNonDup {
    public static void main(String[] args) {
        String str1 = "aabbccddeeffggp";
        //Converts given string into character array
        char[] str2 = str1.toCharArray();
        int count;
        //go through the string's every letter
        for(int i = 0; i < str2.length; i++) {
            count = 0;
            //make the compaction of each letter
            for (int j = i + 1; j < str2.length; j++) {
                //if there are any elements are duplicated and not space
                if (str2[i] == str2[j] && str2[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    str2[j] = '0';
                }
            }
            if (count == 0 && str2[i] != '0') {
                System.out.println(str2[i]);
            }
        }
    }
}
