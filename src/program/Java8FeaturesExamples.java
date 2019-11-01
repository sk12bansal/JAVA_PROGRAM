package program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8FeaturesExamples {

    /*public static void filter(List names, Predicate condition) {
        for (Object name : names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }*/

    public static void filter(List list,Predicate condition){
        list.stream().filter(condition::test).forEach((name)->System.out.println(name));
    }


    public static void main(String args[]){
        //Before Java 8:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        //Java 8 way:
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        for (Object feature : features) { System.out.println(feature); }

        System.out.println("===========lambda expression feature of Java 8===========");
        features.forEach(n -> System.out.println(n));

        System.out.println("==========Method reference feature of Java 8=============");
        features.forEach(System.out::println);

        System.out.println("==========Using Lambda expression and Functional interface Predicate=============");

        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages,(str)->str.toString().startsWith("J"));
        System.out.println("Languages which ends with a ");
        filter(languages,(str)->str.toString().endsWith("a"));
        System.out.println("Print all languages :");
        filter(languages,(str)->true);
        System.out.println("Print no language : ");
        filter(languages,(str)->false);
        System.out.println("Print language whose length greater than 4:");
        filter(languages,(str)->str.toString().length()>4);


    }
}
