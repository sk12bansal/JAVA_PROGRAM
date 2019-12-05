package program.DP;

import java.util.*;
import java.lang.*;
import java.io.*;

class LongestCommonSubstring {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            int[][] lcs = new int[n][m];
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        if (i == 0 || j == 0)
                            lcs[i][j] = 1;
                        else {
                            lcs[i][j] = lcs[i - 1][j - 1] + 1;
                            max = Integer.max(max,lcs[i][j]);
                        }
                    } else {
                        lcs[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(lcs[i][j] +" ");
                }
                System.out.println();
            }
            System.out.println(max);
            t -= 1;
        }
    }
}

/*
import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubstring {


    public static List<String> commonSubstring(String S1, String S2) {
        Integer match[][] = new Integer[S1.length()][S2.length()];

        int len1 = S1.length();
        int len2 = S2.length();
        int max = Integer.MIN_VALUE;
        ArrayList<String> result = null;

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (S1.charAt(i) == S2.charAt(j)) {
                    if (i == 0 || j == 0) match[i][j] = 1;

                    else match[i][j] = match[i - 1][j - 1] + 1;

                    if (match[i][j] > max) {
                        max = match[i][j];
                        result = new ArrayList<String>();
                        result.add(S1.substring(i - max + 1, i + 1));
                    } else if (match[i][j] == max) {
                        result.add(S1.substring(i - max + 1, i + 1));
                    }
                } else match[i][j] = 0;

            }
        }
        return result;
    }


    public static void main(String args[]) {
        List<String> result = commonSubstring("CLCL", "LCLC");
        for (String str : result) {
            System.out.println(str);
        }
    }

}
*/
