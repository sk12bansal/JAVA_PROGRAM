package program;

import java.util.Scanner;

public class DelConsecutiveElement {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while(t>0){
            String str = s.nextLine();
            System.out.print(str.charAt(0));
            for(int i =0;i<str.length()-1;i++){
                if(str.charAt(i+1)== str.charAt(i)){
                   continue;
                }
                System.out.print(str.charAt(i + 1));
            }
            System.out.println();
            t = t-1;
        }
    }
}
