package program.Algorithms;

import java.util.Arrays;
import java.util.List;

public class SlidingWindowAlgo {
    public static void main(String args[]){
       List<Integer> arr = Arrays.asList(1, 0, 0, 1, 1, 0, 1, 0, 1, 1);
       int m =2;
       int wL =0,wR =0;
       int bestL =0, windowSize =0;
       int zeroCounts =0;
       int n = arr.size();
       while(wR<n){

           if(zeroCounts<=m){

               if(arr.get(wR) ==0){
                   zeroCounts++;
               }
               wR++;
           }

           if(zeroCounts>m){

               if(arr.get(wL) ==0){
                   zeroCounts--;
               }
               wL++;
           }

           if((wR-wL>windowSize && zeroCounts<=m)){
               windowSize = wR-wL;
               bestL = wL;
           }
       }
       System.out.println(bestL + " "+ windowSize);
    }
}
