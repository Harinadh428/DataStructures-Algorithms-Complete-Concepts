package main.corejava;

/**
 * @author harinadh dasari
 */
public class GenerateBits {

    public static void main(String[] args) {

        int [] arr = {10,20};

        int limit = (int) Math.pow(2, arr.length);

     //   System.out.println(limit);

        for(int i=0;i<limit;i++){
            System.out.print(i+" ");
        }
    }
}
