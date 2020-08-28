package algoritm_02_selection_sort;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// Сортировка выбором
public class SelectionSort {

    private static List<Integer> selectionSort(List<Integer> arr) {
        //List<Integer>-выходной параметр;List<Integer> arr-входной параметр с именем arr;selectionSort-название метода
        List<Integer> newArr = new ArrayList<>(arr.size());
        //создаем новый массив newArr той же самой длинны, что и поступил на вход

        int size = arr.size();
        //кладем в переменную size длинну массива
        for (int i = 0; i < size; i++) {
            //цикл вызывает функцию findSmallest столько раз, сколько элементов в массиве
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));
            arr.remove(smallest);
        }

        return newArr;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        //получить первоначальное минимальное значение в массиве-это 5
        int smallestIndex = 0;
        //индекс первого элемента, принятый как минимальный
        for (int i = 0; i < arr.size(); i++) {
            //i-индекс элементов от 0 до 4;цикл выполняется столько раз, сколько элементов в массиве
            if (arr.get(i) < smallest) {
                //сравниваем значение первого элемента массива(первый элемент массива i=0) со значением smallest(индекс тоже равен 0).Условие не выполняется, тогда сравниваем значение второго элемента массива(i+1=1) со значением smallest, индекс которого все еще 0.Условие выполняется(3<5)
                smallest = arr.get(i);
                //Условие выполнилось(3<5) и тогда smallest вместо индекса i=0(значение 5) становится i=1(значение 3)
                smallestIndex = i;
                //индекс минимального числа на данный момент.Далее i в цикле for увеличивается и становится i=2(значение 6) и уже оно сравнивается с 3 и т.д.
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr));
    }
}
