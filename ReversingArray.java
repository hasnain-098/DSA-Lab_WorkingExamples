public class ReversingArray {

    static int[] reverseArray(int[] arr) {

        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }

    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Before reversing");
        printArray(arr);

        arr = reverseArray(arr);

        System.out.println("\nAfter reversing");
        printArray(arr);
    }
}
