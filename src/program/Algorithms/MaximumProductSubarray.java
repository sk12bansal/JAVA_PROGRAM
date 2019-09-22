package program.Algorithms;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int max_end =1;
            int min_end =1;
            int max_so_far =1;
            int flag =0;
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    max_end = max_end *arr[i];
                    min_end = Math.min(1,min_end*arr[i]);
                    flag =1;
                } else if(arr[i] == 0){
                    max_end =1;
                    min_end =1;
                } else {
                    int temp = max_end;
                    max_end = Math.max(min_end*arr[i],1);
                    min_end = temp*max_end;
                }

                if(max_so_far < max_end){
                    max_so_far = max_end;
                }

                if(flag==0 && max_end ==1){
                    System.out.println("0");
                }

                System.out.println(max_so_far);

            }
            t= t-1;
        }
    }
}
