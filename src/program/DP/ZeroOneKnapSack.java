package program.DP;

import java.util.Arrays;
import java.util.Scanner;


public class ZeroOneKnapSack {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n =sc.nextInt();
            int weightVal = sc.nextInt();
            int [] weight = new int[n];
            int [] value = new int[n];

            for(int i=0;i<n;i++){
                weight[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                value[i] = sc.nextInt();
            }

            int [][] dp = new int[n+1][weightVal+1];


            for(int i=0;i<=n;i++){

                for(int w=0;w<=weightVal;w++){

                    if(i==0 || w==0){
                        dp[i][w] =0;
                    }else if(weight[i-1]<=w){
                        dp[i][w] = Math.max(value[i-1]+dp[i-1][w-weight[i-1]],dp[i-1][w]);
                    }else{
                        dp[i][w]= dp[i-1][w];
                    }
                }

            }
            for(int i=0;i<=n;i++){
                for(int w=0;w<=weightVal;w++){
                    System.out.print(dp[i][w] + " ");
                }
                System.out.println();
            }
            System.out.println(dp[n][weightVal]);
            t =t-1;
        }
    }
}
