package java8;

import java.util.*;

public class Lambda {
    public static void main(String args[]){
        List<String> names = Arrays.asList("suraj","ritesh","rajiv","abhinav","akhand");
        /*Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
*/
        /*Collections.sort(names,(String a,String b)->{
            return a.compareTo(b);
        });*/
       // Collections.sort(names,(String a, String b)-> a.compareTo(b));

        // Collections.sort(names,(a, b)-> a.compareTo(b));
        //names.sort((a, b)-> a.compareTo(b));
        names.sort(String::compareTo);
        for (String name : names) {
            System.out.println(name);
        }


    }
}
