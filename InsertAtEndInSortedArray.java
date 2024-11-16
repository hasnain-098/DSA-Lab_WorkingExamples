/*
 * Author: Hasnain Memon
 * Date:   29/10/2024
 */

// Task : Insert element at end in sorted array

public class InsertAtEndInSortedArray {

    static int insertEndSorted(int[] arr, int n, int key, int capacity) {

        if (n >= capacity) {
            return n;
        }

        arr[n] = key;

        return (n + 1);
    }

    // This method sorts array in ascending order
    static void sort(int[] arr, int n) {

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

        int[] arr = new int[20];
        arr[0] = 16;
        arr[1] = 12;
        arr[2] = 50;
        arr[3] = 20;
        arr[4] = 40;
        arr[5] = 70;

        int capacity = 20; //length of array
        int n = 6; // index at which key will be inserted
        int key = 26; //value to be inserted

        sort(arr, n);
        System.out.println("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Inserting key
        n = insertEndSorted(arr, n, key, capacity);

        sort(arr, n);
        System.out.println("\nAfter Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
