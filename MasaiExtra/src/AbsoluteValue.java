public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println(difference(12,4));
        System.out.println(difference(4,18));
    }
    public static int difference(int a,int b) {
        return abs(a-b);
    }
    public static int abs(int A) {
        return A<0?A*-1:A;
    }
}
