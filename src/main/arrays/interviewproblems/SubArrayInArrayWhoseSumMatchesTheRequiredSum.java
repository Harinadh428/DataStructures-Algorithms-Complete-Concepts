package main.arrays.interviewproblems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author harinadh dasari
 * Find subArray in array whose sum matches required sum
 * Example- in inputString(123451) following subString [123, 51] have sum=6
 */
public class SubArrayInArrayWhoseSumMatchesTheRequiredSum {

    static Set<String> s = new HashSet<>();

    public static void main(String[] args) {
        String input = "123";
        findPairs(input.toCharArray(), 6);

        s.forEach(e -> System.out.print(e + " "));
    }

    static void findPairs(char[] ar, int requiredSum) {

        for (int i = 0; i < ar.length-1; i++) {
            int sum = 0;
            for (int j = i; j < ar.length; j++) {
                sum = sum + Integer.parseInt(String.valueOf(ar[j]));

                if (sum > requiredSum) {
                    break;
                } else if (sum == requiredSum) {
                    int iRef = i;
                    char[] subArray = new char[j - i + 1];
                    for (int k = 0; k < j - i + 1; k++) {
                        subArray[k] = ar[iRef++];
                    }
                    s.add(new String(subArray));
                    break;
                }
            }
        }
    }
}

