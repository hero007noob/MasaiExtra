package temp;

public class temp {
    public static void main(String[] args) {
        
    }
    public static String solve(int width,int height,int length,int mass){
        long volume = width*height*length;
        if(volume>1000000){
            if(width>150 || height>150 || length>150){
                return "REJECTED";
            }else{
                return "SPECIAL";
            } 
        }else if(width>150 || height>150 || length>150){
            return "SPECIAL";
        }else{
            return "STANDARD";
        }
    }
    public static int[] filter_duplicates(int[] data){
        int[] intArray = new int[data.length]; 
        int index =0;
        
        for (int i=0; i<data.length; i++) {
        boolean contain = false;
        for (int element : intArray) {
            if (element == data[i]) {
                contain = true;
                break;
            }
        }
        if (!contain)
            intArray[index] = data[i];
            index++;
        }
        int count = 0;
        for (int i=0; i<intArray.length; i++) {
            if(intArray[i] == 0){
                count++;
            }
        }
        int[] ansArray = new int[count];
        for (int i=0; i<ansArray.length; i++) {
            ansArray[i] = intArray[i];
        }

        return ansArray;
    }
}
