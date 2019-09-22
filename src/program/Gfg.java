package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gfg {
    /*public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        *//*int t = in .nextInt();
        while(t>0){
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                int tmp=in.nextInt();
                list.add(tmp);
            }
            int ans =list.get(0);
            for(int i=1;i<list.size();i++){
                ans = ans ^ list.get(i);
            }
            System.out.println(ans);
            t =t -1;
        }*//*

        String str = "1,2,6,4";
        String[] strArr = str.split(",");
        System.out.println(Integer.valueOf(strArr[1])+Integer.valueOf(strArr[0]));


    }*/

    public static void main (String[] args) {
//add code here.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int res = 0;
            int po=0;
            while (n > 0) {
                int rem = n % 10;
                if (rem == 0) {
                    rem = 5;
                }
                res = (int) (rem * Math.pow(10,po) + res);
                n = n / 10;
                po++;
            }
            System.out.println(res);
            t = t - 1;
        }
    }
}
