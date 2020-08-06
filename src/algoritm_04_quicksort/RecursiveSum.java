package algoritm_04_quicksort;
import java.util.Arrays;

public class RecursiveSum {

    private static int sum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 1; i <= newArr.length; i++) {
                newArr[i - 1] = arr[i];
            }
            return arr[0] + sum(newArr);
        }
    }

    private static int sum2(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[0] + sum2(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int[] arr2 = new int[] {8, 10, 12};
        System.out.println(sum(arr));
        System.out.println(sum(arr2));
        System.out.println(sum(new int[] {90, 9, 1}));

//        int[] newArr = new int[arr.length - 1];
//        for (int i = 1; i <= newArr.length; i++) {
//            newArr[i-1] = arr[i];
//        }
    }
}
