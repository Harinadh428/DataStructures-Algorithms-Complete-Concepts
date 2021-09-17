package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class FirstAndLastIndexOfGivenNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 20, 43, 44, 43, 24};

        int lo = 0;
        int hi = arr.length - 1;
        int fi = -1;

        int data = 20;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                fi = mid;
                hi = mid - 1;
            }
        }
        System.out.println(fi);

        lo = 0;
        hi = arr.length - 1;
        int li = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                li = mid;
                lo = mid + 1;
            }
        }
        System.out.println(li);
    }
}
