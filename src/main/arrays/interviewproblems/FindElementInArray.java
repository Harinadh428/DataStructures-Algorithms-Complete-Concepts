package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class FindElementInArray {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 5, 7, 2, 4, 5};
        int findEle = 2;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findEle) {
                System.out.println("Found the Element at Index :" + i);
                index = i;
                return;
            }
        }

        System.out.println(index);
    }
}
