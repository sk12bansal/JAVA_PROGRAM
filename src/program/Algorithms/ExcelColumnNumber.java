package program.Algorithms;

import java.util.Scanner;

public class ExcelColumnNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String columnName = sc.next();
            int res =0;
            for(int i=0;i<columnName.length();i++){
                res *=26;
                res += columnName.charAt(i)-'A'+1;

            }
            System.out.println(res);
            t-=1;
        }
    }
}
