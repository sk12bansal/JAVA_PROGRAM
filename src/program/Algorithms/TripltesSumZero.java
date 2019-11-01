package program.Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TripltesSumZero {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(0, -1, 2, -3, 1);
        int n = list.size();
        Collections.sort(list);
        boolean found = false;
        for(int i=0;i<n-1;i++){
            int l=i+1;
            int r =n-1;
            int x = list.get(i);
            while(l<r) {
                int sum = x + list.get(l) + list.get(r);
                if (sum == 0) {
                    System.out.println(x + " " + list.get(l) + " " + list.get(r));
                    l++;
                    r--;
                    found = true;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        if(!found){
            System.out.println("not found");
        }
    }
}
