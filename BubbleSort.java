import java.util.Arrays;

public class BubbleSort {

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int swaps = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps = 1;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {67, 44, 82, 17, 20};

        System.out.println("Before sorting: " + Arrays.toString(array));
        sort(array);
        System.out.println("After sorting " + Arrays.toString(array));
    }
}
