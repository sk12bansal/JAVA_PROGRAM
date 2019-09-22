package program.Algorithms;

import java.util.*;
import java.lang.*;

public class LargestSumContiguous {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int curMax, gMax;
            curMax = arr[0];
            gMax = arr[0];
            for (int i = 1; i < n; i++) {
                curMax = Math.max(arr[i], (curMax + arr[i]));
                gMax = Math.max(curMax, gMax);
            }
            System.out.println(gMax);

            t = t - 1;
        }
    }
}