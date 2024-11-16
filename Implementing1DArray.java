/*
 * Author: Hasnain Memon
 * Date: 29/10/2024
 */

// Task : Implement 1D array(Initialization, Declaration, Add, Edit,Delete)

import java.util.Arrays;

public class Implementing1DArray {

    private int[] arr;
    private int size;

    public Implementing1DArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int element) {

        if (size == arr.length) {
            arr = Arrays.copyOf(arr, size  + 1);
        }
        arr[size] = element;
        size++;
    }

    public void edit(int index, int value) {
        if (index >= 0 || index < size) {
            arr[index] = value;
        } else {
            System.out.println("Arrays index out of bounds!");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1]; //shift elements to the left
            }
            size--;
            arr = Arrays.copyOf(arr, size);
        } else {
            System.out.println("Array index out of bounds");
        }
    }

    public static void main(String[] args) {

        Implementing1DArray arrayUtil = new Implementing1DArray(5);
        arrayUtil.add(10);
        arrayUtil.add(20);
        arrayUtil.add(30);
        arrayUtil.add(40);
        arrayUtil.add(50);

        System.out.println(Arrays.toString(arrayUtil.arr));

        arrayUtil.add(90);

        System.out.println(Arrays.toString(arrayUtil.arr));

        arrayUtil.edit(1, 25);

        System.out.println(Arrays.toString(arrayUtil.arr));

        arrayUtil.delete(2);

        System.out.println(Arrays.toString(arrayUtil.arr));
    }
}
