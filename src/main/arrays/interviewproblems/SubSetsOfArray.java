package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class SubSetsOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int maxLimit = (int) Math.pow(2, arr.length);

        for (int i = 0; i < maxLimit; i++) {
            int temp = i;
            String set = "";

            for (int j = arr.length - 1; j >= 0; j--) {

                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}
