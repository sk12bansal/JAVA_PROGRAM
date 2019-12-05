package program.Array;

import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumIndex {
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
            int[] leftMin = new int[n];
            int[] rightMax = new int[n];
            leftMin[0] = arr[0];

            for (int i = 1; i < n; i++)
                leftMin[i] = Math.min(arr[i], leftMin[i - 1]);

            rightMax[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--)
                rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
            int i = 0;
            int j = 0;
            int maxIndex = 0;
            while (i < n && j < n) {
                if (leftMin[i] <= rightMax[j]) {
                    maxIndex = Math.max(maxIndex, j - i);
                    j += 1;
                } else {
                    i += 1;
                }
            }
            System.out.println(maxIndex);

            t -= 1;
        }
    }
}