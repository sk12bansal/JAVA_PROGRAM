package java_assignment;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger ans = factorial(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.valueOf(1);
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
