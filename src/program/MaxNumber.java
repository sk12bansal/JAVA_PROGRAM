package program;

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxNumber {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();
            //String str = Integer.toString(n);
            int[] count = new int[10];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - '0']++;
            }
            String result = "0";
            int multiplier = 1;
            for (int i = 0; i <= 9; i++) {
                while (count[i] > 0) {

                    result = String.valueOf(result) + Integer.toString((i * multiplier));
                    count[i]--;
                    multiplier = multiplier * 10;
                }
            }
            System.out.println(result);
            t -= 1;
        }
    }
}
