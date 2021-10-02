package main.corejava;

/**
 * @author harinadh dasari
 */
public class FindIndexSumOfElementsWholeLeftRIghtEqual {

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 1, 1};

        int li = 0;
        int ri = arr.length - 1;
        int ls = 0;
        int rs = 0;

        while (li <= ri) {

            if (ls > rs) {
                rs = rs + arr[ri--];
            } else {
                ls = ls + arr[li++];
            }
        }
        if (ls == rs) {
            System.out.println(ri);
        } else {
            System.out.println(-1);
        }
    }
}
