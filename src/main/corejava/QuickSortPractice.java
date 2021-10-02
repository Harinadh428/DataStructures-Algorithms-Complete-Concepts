package main.corejava;

/**
 * @author harinadh dasari
 */
public class QuickSortPractice {

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 5, 3, 8, 4};

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int partitionIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, endIndex);
        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {

        int pivot = arr[endIndex];
        int i = startIndex - 1;

        for (int j = startIndex; j < endIndex; j++) {

            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[endIndex];
        arr[endIndex] = temp;
        return i + 1;
    }
}
