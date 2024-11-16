/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Resize an array
// Resizing is done by copying the elements of old array in a new array and then replace the
// old array with the new one.

import java.util.Arrays;

public class ResizeArray {

    private static int[] resizeArray(int[] arr, int newSize) {

        int[] resizedArray = new int[newSize];
        for (int i = 0; i < Math.min(arr.length, newSize); i++) {
            resizedArray[i]  = arr[i];
        }
        return resizedArray;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 9, 11, 90};
        System.out.println(Arrays.toString(arr));
        arr = resizeArray(arr, 20);
        System.out.println(Arrays.toString(arr));
    }
}
