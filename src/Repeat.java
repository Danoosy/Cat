import java.sql.SQLOutput;
import java.util.List;

public class Repeat { // Quicksort

    private static Integer simpleSearch (int[] list, int item) {
        for (int x = 0; x < list.length; x++) {
            if (list[x] == item) {
                return x;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 8, 10, 5, 3};

        System.out.println(simpleSearch(myList, 5));
    }
}





