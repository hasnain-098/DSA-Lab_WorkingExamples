import java.util.Arrays;

public class SelectionSort {

    private void sort(int[] array) {

        int minIndex, temp;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        SelectionSort obj = new SelectionSort();
        int[] array = {88, 55, 23, 76, 100, 99};
        System.out.println("Before Sorting: " + Arrays.toString(array));
        obj.sort(array);
        System.out.println("After Sorting: " + Arrays.toString(array));
    }
}
