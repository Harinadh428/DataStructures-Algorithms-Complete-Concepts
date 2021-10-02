package main.corejava;

/**
 * @author harinadh dasari
 */
public class RemoveDuplicatesFromAray {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3};
        int i =0;
        int j= 1;

        while(j< arr.length){
            if (arr[j] == arr[i]){
                j++;
            }else{
                arr[++i] = arr[j++];
            }
        }

        int[] x = new int[i+1];

        for(int y=0;y<x.length;y++){

        }
    }
}
