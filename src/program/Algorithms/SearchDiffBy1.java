package program.Algorithms;

import java.util.Arrays;
import java.util.List;

public class SearchDiffBy1 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3);
        int x =3;
        int i=0;
        int n = list.size();
        while(i<n){

            if(list.get(i)==x){
                System.out.println(i);
                break;
            }

            i = i+Math.abs(list.get(i)-x);
            System.out.println("index "+i);
        }
    }
}
