package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class SortArrayWith0s1s2ndDeutchFlag {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 0, 1, 1, 2};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            switch (arr[mid]) {
                case 0:
                    if (arr[low] != arr[mid]) {
                        int temp = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp;
                    }
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if (arr[mid] != arr[high]) {
                        int temp = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp;
                    }
                    high--;
            }
        }
    }
}
