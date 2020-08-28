package algoritm_04_quicksort;
import java.util.Arrays;
// Подсчет всех элементов в массиве (как в книге, только в книге list вместо arr)
public class RecursiveCount {

    private static int count(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
// то, что мы писали
    private static int count2(int[] arr) {

        return arr.length;
    }

    public static void main(String[] args) {

        System.out.println(count(new int[] {2, 4, 7, 8}));
    }
}
