/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Search an element in an unsorted array

public class SearchingInAnUnsortedArray {

    //This method returns index of element found.
    static int findElement(int[] arr, int n, int key) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    //This method returns boolean to confirm that element is present or not.
//    static boolean findElement(int[] arr, int n, int key) {
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == key) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 10, 2, 6, 4};
        int element = 4;

        int index = findElement(arr, arr.length, element);
        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index " + index);
        }


//        boolean contains = findElement(arr, arr.length, element);
//        if (!contains) {
//            System.out.println("Element not found!");
//        } else {
//            System.out.println("This array contains element " + element);
//        }
    }
}
