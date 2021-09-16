package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class SpanOfArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 8, 3, 19, 8};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int span = max - min;
        System.out.println("Span of Array Is :" + span);
    }
}
