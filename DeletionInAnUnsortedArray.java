/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Implement Delete operation in an unsorted array

public class DeletionInAnUnsortedArray {

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

    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 40, 20};
        int n = arr.length;
        int key = 30;

        System.out.println("Array before deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        n = deleteElement(arr, n, key);

        System.out.println("\nArray after deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
