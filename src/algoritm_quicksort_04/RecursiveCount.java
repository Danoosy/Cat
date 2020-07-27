package algoritm_quicksort_04;
import java.util.Arrays;

public class RecursiveCount {

    private static int count(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    private static int count2(int[] arr) {
        return arr.length;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[] {2, 4, 7, 8}));
    }
}
