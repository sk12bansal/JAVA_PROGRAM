package java8;
import java.io.*;
import java.util.*;

public class stringcal {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str = "welcometojava";
        /*String B=sc.next();
        System.out.println(A.length()+B.length());
        String isGreater = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(isGreater);
        String merge = A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(merge);*/
        ArrayList<String> strlist = new ArrayList<>();
        for(int i=0;i<str.length()-2;i++){
            String tmp = str.substring(i,i+3);
            strlist.add(tmp);
        }
        strlist.sort((a,b)->a.compareTo(b));
        for(int i=0;i<strlist.size();i++){
            System.out.println(strlist.get(i));
        }

    }
}



