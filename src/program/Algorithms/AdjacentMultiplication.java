package program.Algorithms;

import java.util.Arrays;
import java.util.List;

public class AdjacentMultiplication {
    public static void main(String args[]){
        //List<Integer> list = Arrays.asList(2,3,4,5,6);
        int [] arr = {2,3,4,5,6};

        int prev = arr[0];
        arr[0] = prev*arr[1];

        int n = arr.length;

        for(int i=1;i<n-1;i++){

            int curr = arr[i];

            arr[i] = prev * arr[i+1];

            prev = curr;
        }

        arr[n-1] = prev * arr[n-1];

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
     }
}
