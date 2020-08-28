package algoritm_04_quicksort;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {

    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            // Базовый случай, массивы с элементами 0 и 1 уже отсортированы
            return list;
        } else {
            // рекурсивный случай
            Integer pivot = list.get(0);

            // подмассив всех элементов меньше опорного
            List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot).collect(Collectors.toList());

            // sub-array of all the elements greater than the pivot
            List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot).collect(Collectors.toList());

            return Stream.of(
                    quicksort(less).stream(),
                    Stream.of(pivot),
                    quicksort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
    } // [2, 3, 5, 10]

}
