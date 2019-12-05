package program.Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumPlatforms {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] dep = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                dep[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(dep);
            int i = 1, platform = 1, res = 1;
            int j = 0;
            while (i < n && j < n) {
                if (arr[i] <= dep[j]) {
                    platform++;
                    i++;

                    if (platform > res) {
                        res = platform;
                    }
                } else {
                    j++;
                    platform--;
                }
            }
            System.out.println(res);
            t -= 1;
        }
    }
}