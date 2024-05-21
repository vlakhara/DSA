
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pos = partition(arr, low, high);
            quickSort(arr, low, pos - 1);
            quickSort(arr, pos + 1, high);
        }

    }

    static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivet = arr[low];

        while (i <= j) {
            if (arr[i] > pivet) {
                if (arr[j] < pivet) {
                    swap(arr, i, j);
                } else {
                    --j;
                }
            } else {
                i++;
            }
        }

        swap(arr, j, low);

        return j;
    }
}
