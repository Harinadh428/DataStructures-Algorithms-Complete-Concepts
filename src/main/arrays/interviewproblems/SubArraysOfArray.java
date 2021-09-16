package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class SubArraysOfArray {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
