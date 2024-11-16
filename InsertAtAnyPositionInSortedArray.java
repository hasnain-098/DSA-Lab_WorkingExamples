/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Insert element at any position in sorted array

public class InsertAtAnyPositionInSortedArray {

    static void insertElement(int[] arr, int n, int x, int position) {

        //shift elements to the right
        //which are on the right side of position

        for (int i = n-1; i >= position - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position - 1] = x; //index = position - 1
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

        int[] arr = new int[10];
        arr[0] = 16;
        arr[1] = 12;
        arr[2] = 50;
        arr[3] = 20;
        arr[4] = 40;
        arr[5] = 70;

        int n = 6;
        int x = 30, position = 2;

        sort(arr, n);
        System.out.println("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Inserting key at specific position
        insertElement(arr, n, x, position);
        n += 1;

        sort(arr, n);
        System.out.println("\nAfter Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
