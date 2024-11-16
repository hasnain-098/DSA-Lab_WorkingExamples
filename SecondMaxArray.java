/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Find second maximum value in an array

import java.util.Arrays;

public class SecondMaxArray {

    private static int findSecondMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 6, 9, 0, 11};
        System.out.println(Arrays.toString(arr));
        System.out.println("SecondMax = " + findSecondMax(arr, arr.length));
    }
}
