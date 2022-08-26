import java.util.Arrays;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class ArrayToLower {
    public static void main(String[] args) {
        String[] sample = {"MA", "SA", "I", "SCH", "OOL"};
        for (int i = 0; i < sample.length; i++) {
            sample[i] = ToLower(sample[i]);
        }
        System.out.println(Arrays.toString(sample));
    }
    public static String ToLower(String str) {
        String ans = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                ans+=(char)(str.charAt(i)+('a'-'A'));
        }
        return ans;
    }
}
