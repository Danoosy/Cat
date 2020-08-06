//package main;
//
//public class BinarySearch {
//    public static void main(String[] args) {
//        int[] myList = {87, 21, 45, 93};
//
//        System.out.println(binarySearch(myList, 93));
//        System.out.println(binarySearch(myList, 16));
//    }
//
//    public static int binarySearch(int[] list, int item) {
//        if (isListEmpty(list)) {
//            return -1;
//        }
//
//        int low = 0;
//        int high = list.length - 1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            int guess = list[mid];
//
//            if (guessEqualsItem(guess, item)) {
//                return mid;
//            } else if (guessGreaterThanItem(guess, item)) {
//                high = mid - 1;
//            } else if (guessLessThanItem(guess, item)) {
//                low = mid + 1;
//            }
//        }
//
//        return -1;
//    }
//
//    public static boolean isListEmpty(int[] myList) {
//        int listSize = myList.length;
//        if (listSize == 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean guessEqualsItem(int guess, int item) {
//        if (guess != item) {
//            return false;
//        }
//        return true;
//    }
//
//    public static boolean guessGreaterThanItem(int guess, int item) {
//        if (guess < item) {
//            return false;
//        }
//        return true;
//    }
//
//    public static boolean guessLessThanItem(int guess, int item) {
//        if (guess > item) {
//            return false;
//        }
//        return true;
//    }
//}
package algoritm_01_main;

public class BinarySearch {
    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, -1));
    }
}




























