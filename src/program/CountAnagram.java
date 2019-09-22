package program;

import java.util.Arrays;
import java.util.Scanner;

public class CountAnagram {
    static boolean isAnagram(String w1,String w2){
        char[] w11 = w1.toCharArray();
        char[] w22 = w2.toCharArray();
        Arrays.sort(w11);
        Arrays.sort(w22);
        if(Arrays.equals(w11,w22)){
            return true;
        }
        return false;
    }
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while(t>0){
            String text = s.nextLine();
            String word = s.nextLine();
            int tlen = text.length();
            int wlen = word.length();
            int res =0;
            for(int i=0;i<=tlen-wlen;i++){
                String tmp = text.substring(i,i+wlen);
                if(isAnagram(word,tmp)){
                    res++;
                }
            }
            System.out.println(res);
            t=t-1;
        }
    }
}
