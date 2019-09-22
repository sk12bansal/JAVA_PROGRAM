package program;

import java.util.Scanner;

public class SumNumString {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while(t>0){
            String str = s.nextLine();
            int res= 0;
            for(int i=0; i<str.length();i++){
                StringBuilder tmp = new StringBuilder();
                while(i<str.length() && str.charAt(i)>=48 && str.charAt(i)<=57){
                    tmp.append(str.charAt(i));
                    i++;
                }
                if(!tmp.toString().isEmpty()) {
                    res = res + Integer.parseInt(tmp.toString());
                }
            }
            System.out.println(res);
            t =t-1;
        }
    }
}
