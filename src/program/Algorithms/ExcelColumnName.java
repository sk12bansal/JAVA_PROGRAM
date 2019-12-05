package program.Algorithms;


import java.util.*;
import java.lang.*;
import java.io.*;

class ExcelColumnName {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            StringBuilder columnName = new StringBuilder();
            while (n > 0) {

                int rem = n % 26;

                if (rem == 0) {
                    columnName.append("Z");
                    n = n / 26 - 1;
                } else {
                    columnName.append((char) ((rem - 1) + 'A'));
                    n = n / 26;
                }
            }
            System.out.println(columnName.reverse());
            t -= 1;
        }
    }
}
