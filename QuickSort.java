import java.util.Arrays;

public class QuickSort {

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    private void sort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        QuickSort obj = new QuickSort();
        obj.sort(array, 0, n - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
