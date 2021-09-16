package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class InverseOfArray {

    public static void main(String[] args) {

        int[] arr = {1,3,4,0,2};
        int[] inv = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            inv[arr[i]] = arr[i];
        }
        System.out.println("Before Inverse");

        for(int a: arr){
            System.out.print(a+" ");
        }

        System.out.println();

        for(int x : inv){
            System.out.print(x+" ");
        }
    }
}
