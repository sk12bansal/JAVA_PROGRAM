package lambda_expression;

import java.util.Arrays;
import java.util.List;

public class ListIterator {
    public static void main(String args[]){
        //Prior Java 8 :
        List features1 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (Object feature : features1) { System.out.println(feature); }

        //In Java 8:
        List features2 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features2.forEach(ele -> System.out.println(ele));
    }
}
