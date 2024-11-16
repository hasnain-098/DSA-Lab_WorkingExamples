public class MinimumValueInArray {

    static int findMinimum(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 13, 19, 21, 34, 50};

        int min = findMinimum(arr);

        printArray(arr);
        System.out.println("Min = " + min);
    }
}
