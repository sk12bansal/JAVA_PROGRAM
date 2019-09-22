package program;

import java.util.*;
import java.lang.*;

class RemoveChar {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for (int i = 0; i < s2.length(); i++) {
                if (s1.contains(String.valueOf(s2.charAt(i)))) {
                    s1 = s1.replace(String.valueOf(s2.charAt(i)), "");
                }
            }
            System.out.println(s1);
            t = t - 1;
        }
    }
}

