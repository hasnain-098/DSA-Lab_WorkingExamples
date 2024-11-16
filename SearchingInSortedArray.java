/*
 * Author: Hasnain Memon
 * Date:   29/10/2024
 */

// Task : Search an element in a sorted array

public class SearchingInSortedArray {

    static int findElement(int[] arr, int key) {

        sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // This method sorts array in ascending order
    static void sort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If swapped is false, means the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 50, 40, 20, 70};

        int key = 50;
        int index = findElement(arr, key);

        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}
