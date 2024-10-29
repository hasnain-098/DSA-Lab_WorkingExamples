/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Insert element at end

public class InsertAtEndInArray {

    static int insertEnd(int[] arr, int n, int key, int capacity) {

        if (n >= capacity) {
            return n;
        }

        arr[n] = key;

        return (n + 1);
    }

    public static void main(String[] args) {

        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;

        int capacity = 20; //length of array
        int n = 6; // index at which key will be inserted
        int key = 26; //value to be inserted

        System.out.println("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Inserting key
        n = insertEnd(arr, n, key, capacity);

        System.out.println("\nAfter Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
