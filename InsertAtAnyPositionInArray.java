/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Insert element at any position

public class InsertAtAnyPositionInArray {

    static void insertElement(int[] arr, int n, int x, int position) {

        //shift elements to the right
        //which are on the right side of position

        for (int i = n-1; i >= position - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position - 1] = x; //index = position - 1
    }

    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;

        int n = 6;
        int x = 30, position = 2;
        System.out.println("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Inserting key at specific position
        insertElement(arr, n, x, position);
        n += 1;

        System.out.println("\nAfter Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
