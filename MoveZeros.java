/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Move zeros to an end in an array

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] arr) {

        int j = 0; // It focuses on zero elements
        for (int i = 0; i < arr.length; i++) { // "i" focuses on non-zero elements
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 9, 0, 0, 8, 10, 0};

        System.out.println("Array: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("\nAfter moving zeros to an end\n");
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
