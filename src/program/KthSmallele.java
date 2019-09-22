package program;

import java.util.*;

public class KthSmallele {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n =s.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                int tmp = s.nextInt();
                list.add(tmp);
            }
            int k =s.nextInt();
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            //Collections.reverse(list);
            System.out.println(list.get(k));
            int[] arr = new int[n];
            
            t =t -1;
        }

    }
}
