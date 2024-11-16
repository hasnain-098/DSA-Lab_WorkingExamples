/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : find missing number in an array

import java.util.HashSet;

public class MissingNumberArray {

    //Suitable for all integer numbers - More robust
    public static Integer findMissingNumber(int[] arr) {

        HashSet<Integer> numberSet = new HashSet<>();
        for (int num : arr) {
            numberSet.add(num);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Search for the missing number in the full range from min to max
        for (int i = min; i <= max; i++) {
            if (!numberSet.contains(i)) {
                return i;
            }
        }

        return null;
    }

    //Suitable for positive number (1 to n)
    public static int findMissingNumber(int[] arr, int n) {
        n = n + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 6, 8, 2, 4, 7};
        System.out.println("Missing number in arr1 = " + findMissingNumber(arr1, arr1.length));

        int[] arr2 = {0, 3, 6, 8, 2, 4, 7};
        System.out.println("Missing number in arr2 = " + findMissingNumber(arr2));
    }
}