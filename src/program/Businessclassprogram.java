package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Businessclassprogram {
    public static void main(String args[]){

       System.out.println(10.0/0.0);


        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);


        String s3 = "JournalDev";
        int start = 1;
        char end = 5;
        System.out.println(start + end);
        System.out.println(s3.substring(start, end));


        HashSet shortSet = new HashSet();
        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }
        System.out.println(shortSet.size());

/*
        Boolean flag = null;
        try {
            if (flag) {
                while (true) {
                }
            } else {
                System.exit(1);
            }
        } finally {
            System.out.println("In Finally");
        }*/

       /* String str = null;
        String str1="abc";
        System.out.println(str1.equals("abc") | str.equals(null));*/


    }
}
