public class SwapCaseMultiple {
    public static void main(String[] args) {
        String sample = "Test";
        for (int i = 0; i < sample.length(); i++) {
            char ch = sample.charAt(i);
            if(ch<='Z'){
                System.out.print(ToLower(ch));
            }else{
                System.out.print(ToUpper(ch));
            }
        }    
    }
    public static char ToLower(char ch) {
        return (char)(ch+('a'-'A'));
    }
    public static char ToUpper(char ch) {
        return (char)(ch-('a'-'A'));
    }

}
