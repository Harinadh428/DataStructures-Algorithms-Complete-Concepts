package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 * <p>
 * Let’s understand the question first :
 * In ar=[2 4 4 1 1 ] : sum of elements on left(i.e. from index 0 to 1) = sum of elements on right(i.e. from index 2 to 4)
 * In ar=[2 1 1 4 ] : sum of elements on left(i.e. from index 0 to 2) = sum of elements on right(i.e. from index 3 to 3)
 * In ar=[2 1 1 2 2 4 ] : sum of elements on left(i.e. from index 0 to 3) = sum of elements on right(i.e. from index 4 to 5)
 * In ar=[2 4 1 1 ] : No index found where  sum of elements on left = sum of elements on right
 * In this program we will try to finds index in array such that - sum of elements on whose left is equal to sum of elements
 * on right in java.
 */
public class FindIndexInArraySuchThatSumOfElementsOnWhoseLeftEqualToSumOfItsRight {
    public static void main(String[] args) {

        int[] arr = {2, 1, 1, 2, 2, 4};
        int index = FindIndexOfSum(arr);
        if (index == 1) {
            System.out.println("Find the Index for Sum of it's left and rights are Equal " + index);
        } else {
            System.out.println("No Index Found for sum of it's left and right are equals :" + index);
        }
    }

    private static int FindIndexOfSum(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int leftSum = 0;
        int rightSum = 0;

        while (leftIndex <= rightIndex) {
            if (leftSum > rightSum) {
                rightSum = rightSum + arr[rightIndex--];
            } else {
                leftSum = leftSum + arr[leftIndex++];
            }
        }
        if (leftSum == rightSum) {
            return rightIndex;
        } else {
            return -1;
        }
    }
}
