package program;

import java.io.File;
import java.util.Scanner;

public class AddDigit {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t>0){
            StringBuilder stringBuilder = new StringBuilder();
            String str = s.nextLine();
            stringBuilder.append(str);
            if(stringBuilder.length()==1){
                System.out.println(stringBuilder);
            }
            while(stringBuilder.length()>1){
                int res= 0;
                for(int i=0;i<stringBuilder.length();i++){
                    res = res+Integer.valueOf(str.charAt(i));
                }
               // stringBuilder = String.valueOf(res);
                System.out.println(str);
            }
            System.out.println(str);
            t= t-1;
        }
    }
}
