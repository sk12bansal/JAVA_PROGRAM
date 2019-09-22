package program;

import java.util.Scanner;

public class RepeatAndMissed {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            int repeatEle = 0;
            int missedEle = 0;
            for(int i=0;i<n;i++){
                if(arr[Math.abs(arr[i])-1]>0){
                    arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
                }else {
                    repeatEle = Math.abs(arr[i]);
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    missedEle = i+1;
                }
            }
            System.out.println(repeatEle+" "+missedEle);
            t =t -1;
        }
    }
}
