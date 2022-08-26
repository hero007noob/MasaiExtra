public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1,3,5,7};
        int average = ArraySum(array)/array.length;
        System.out.println(average);
    }

    private static int ArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
