package program.DP;

import java.util.Arrays;

public class SubSetSumProblem {
    public static  void main(String args[]){
        int [] subset = {2,3,7,8,10};
        int sum = 11;
        int n= subset.length;
        boolean [][] hash = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            hash[i][0]= true;
        }
        for(int i=1;i<=n;i++){
            //System.out.print(subset[i-1] +" ");
            for(int j=1;j<=sum;j++){
                if(j-subset[i-1]>=0){
                    hash[i][j] = hash[i - 1][j] || hash[i - 1][j - subset[i-1]];
                }else{
                    hash[i][j] = hash[i-1][j];
                }
            }
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(hash[i][j]+" ");
            }
            System.out.println();
        }

    }
}
