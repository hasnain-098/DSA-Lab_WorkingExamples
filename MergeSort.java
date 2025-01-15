import java.util.Arrays;

public class MergeSort {

    int[] a = {22, 58, 47, 96, 45, 32, 12};
    int[] b = new int[a.length];

    private void merge(int low, int mid, int high) {
        int l1, l2, i;
        l1 = low;
        l2 = mid + 1;
        i = low;
        while (l1 <= mid && l2 <= high) {
            if (a[l1] <= a[l2]) {
                b[i] = a[l1];
                l1++;
            } else {
                b[i] = a[l2];
                l2++;
            }
            i++;
        }

        while (l1 <= mid) {
            b[i++] = a[l1++];
        }

        while (l2 <= high) {
            b[i++] = a[l2++];
        }

        for (i = low; i <= high; i++) {
            a[i] = b[i];
        }
    }

    private void sort(int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void main(String[] args) {

        MergeSort obj = new MergeSort();

        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(obj.a));

        obj.sort(0, obj.a.length - 1);

        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(obj.a));
    }
}
