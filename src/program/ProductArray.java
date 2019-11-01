package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductArray {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(20,12);

        int[] left = new int[list.size()];
        int[] right = new int[list.size()];

        left[0] = 1;
        right[list.size()-1] = 1;
        for(int i=1;i<list.size();i++){
            left[i] = left[i-1]*list.get(i-1);
        }

        for(int i=list.size()-2;i>=0;i--){
            right[i] = right[i+1]*list.get(i+1);
        }

        for(int i=0;i<list.size();i++){
            System.out.print(left[i]*right[i] + " ");
        }
        System.out.println();
        for(int i=0;i<list.size();i++){
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for(int i=0;i<list.size();i++){
            System.out.print(right[i] + " ");
        }
    }
}
