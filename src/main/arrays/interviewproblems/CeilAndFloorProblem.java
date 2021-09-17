package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class CeilAndFloorProblem {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 55, 70, 80, 90, 100, 110, 120, 130};
        int lo = 0;
        int hi = arr.length - 1;

        int ceil = 0;
        int floor = 0;

        int data = 21;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (data < arr[mid]) {
                hi = mid - 1;
                ceil = mid;
            } else if (data > arr[mid]) {
                lo = mid + 1;
                floor = mid + 1;
            } else {
                ceil = arr[mid];
                floor = arr[mid];
            }
        }

        System.out.println(floor + " ---- " + ceil);
    }
}
