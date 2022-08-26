import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;
public class ReplacePositions {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("AbC");
        str.replace(str.indexOf("A"), str.indexOf("A")+1, "a");
        str.setCharAt(str.indexOf("b"), 'B');
        str.setCharAt(2, 'Y');
        str.insert(0, 'Z');
        str.append('A');
        str.deleteCharAt(2);
        System.out.println(str);
    }
    
}
