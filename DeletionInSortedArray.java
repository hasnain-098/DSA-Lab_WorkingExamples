/*
 * Author: Hasnain Memon
 * Date:   29/10/2024
 */

// Task : Implement Delete operation in sorted array

public class DeletionInSortedArray {

    // Method to delete an element
    static int deleteElement(int[] arr, int n, int key) {

        // Find index of element to be deleted
        int index = findElement(arr, n, key);

        if (index == -1) {
            System.out.println("Element not found!");
            return n;
        }

        //Deleting element
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }

    // Method to search an index of a key to be deleted
    static int findElement(int[] arr, int n, int key) {

        for (int i = 0; i < n; i++) {
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

        int[] arr = {12, 9, 4, 5, 6, 90, 11, 2};
        int n = arr.length;
        int key = 11;

        sort(arr);
        System.out.println("Sorted Array before deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        n = deleteElement(arr, n, key);

        System.out.println("\nSorted Array after deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
