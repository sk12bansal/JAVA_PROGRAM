package program;

import java.util.Scanner;

public class RemoveAdajcent1 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String list = sc.nextLine();
            char[] str = list.toCharArray();
            int length = str.length;
            int start1 = 0, start2 = 1;
            while (start1 < length && start2 < length) {
                char tmp1 = str[start1];
                char tmp2 = str[start2];
                while (tmp1 == '-' || tmp2 == '-') {
                    if (tmp1 == '-') {
                        start1++;
                    }
                    if (tmp2 == '-') {
                        start2++;
                    }
                    if(start1 < length && start2 < length) {
                        tmp1 = str[start1];
                        tmp2 = str[start2];
                    } else {
                        break;
                    }
                }
                if (tmp1 == tmp2) {
                    str[start1] = '-';
                    str[start2] = '-';
                    start1 = 0;
                    start2 = 1;
                } else {
                    start1++;
                    start2++;
                }
            }

            for (start1 = 0; start1 < str.length; start1++) {
                if (str[start1] != '-') {
                    System.out.print(list.charAt(start1) + " ");
                }
            }
            t =t-1;
        }

    }
}
