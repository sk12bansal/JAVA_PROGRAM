package program.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Stringpattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(Pattern.matches("[1][2]{0,2}", "12"));//true
    }
}
