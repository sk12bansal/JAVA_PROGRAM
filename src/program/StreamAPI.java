package program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPI {

    public static void  main(String args[]) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 6);
        //System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e)-> Integer.sum(c,e)));
       // System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));

        List<Integer> values1 = Arrays.asList(12, 20, 35, 42, 55,75,77);
        //System.out.println(values1.stream().filter(i -> i%5==0).reduce(0,Integer::sum));

        /*Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i%5 == 0;
            }
        };*/
       /* System.out.println(values1.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i%5 == 0;
            }
        }).reduce(0,(c,e)-> Integer.sum(c,e)));*/
        System.out.println(values1.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
        System.out.println(values1.stream().filter(i -> i%5==0).map(i -> i*2).reduce(0,Integer::sum));
        System.out.println(values.stream().filter(i -> i%5==0).map(i -> i*2).findFirst().orElse(0));
    }
}
