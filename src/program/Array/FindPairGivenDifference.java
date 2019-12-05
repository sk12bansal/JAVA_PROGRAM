package program.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindPairGivenDifference {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int i = 0;
            int j = 1;
            boolean flag = false;
            while (i < n && j<n) {
                if (i!=j && arr[j] - arr[i] == sum) {
                    flag = true;
                    break;
                } else if (arr[j] - arr[i] > sum) {
                    i++;
                } else {
                    j++;
                }
            }
            System.out.println(flag ? 1 : -1);
            t -= 1;
        }
    }
}
