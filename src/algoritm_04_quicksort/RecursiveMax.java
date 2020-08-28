package algoritm_04_quicksort;

import java.util.Arrays;
// Подсчет максимального числа в массиве (то, что мы писали)
public class RecursiveMax {

    private static int findMax(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int[] leftArr = new int [arr.length / 2];
            int[] rightArr = new int [arr.length - leftArr.length];
            for (int i = 0; i < leftArr.length; i++) {
                leftArr[i] = arr[i];
            }
            for (int i = 0; i < rightArr.length; i++) {
                rightArr[i] = arr[leftArr.length + i];
            }
            int leftMax = findMax(leftArr);
            int rightMax = findMax(rightArr);
            if (leftMax > rightMax) {
                return leftMax;
            } else {
                return rightMax;
            }
        }
    }
// как в книге
    private static int findMax2(int[] list) {
        if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
            //if list[0] > list[1] return list[0] else return list[1]
        }

        int subMax = findMax2(Arrays.copyOfRange(list, 1, list.length));
        //копирует массив list с 1 индекса включительно до длины массива не включительно
        return list[0] > subMax ? list[0] : subMax;
        //if list[0] > subMax return list[0] else return subMax
    }

    public static void main(String[] args) {

        System.out.println(findMax2(new int[] {20, 15, 55, 5}));
    }
}
