package program.Regex;

import java.util.regex.Pattern;

public class JavaRexExamples {
    public static void main(String args[]) {

        /*Regular Expression . Example
        The . (dot) represents a single character.*/

        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)

        System.out.println("========================================");
        /*
        * Regex Character classes
            No.	Character Class	Description
            1	[abc]	a, b, or c (simple class)
            2	[^abc]	Any character except a, b, or c (negation)
            3	[a-zA-Z]	a through z or A through Z, inclusive (range)
            4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
            5	[a-z&&[def]]	d, e, or f (intersection)
            6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
            7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
        * */

        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

        /*
        * Regex Quantifiers
            The quantifiers specify the number of occurrences of a character.

            Regex	Description
                X?	X occurs once or not at all
                X+	X occurs once or more times
                X*	X occurs zero or more times
                X{n}	X occurs n times only
                X{n,}	X occurs n or more times
                X{y,z}	X occurs at least y times but less than z times
         * */
        System.out.println("================quantifier===========================");
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)


        /*
        * Regex Metacharacters
        The regular expression metacharacters work as shortcodes.

        Regex	Description
            .	Any character (may or may not match terminator)
            \d	Any digits, short of [0-9]
            \D	Any non-digit, short for [^0-9]
            \s	Any whitespace character, short for [\t\n\x0B\f\r]
            \S	Any non-whitespace character, short for [^\s]
            \w	Any word character, short for [a-zA-Z_0-9]
            \W	Any non-word character, short for [^\w]
            \b	A word boundary
            \B	A non word boundary
        * */

        System.out.println("metacharacters d...."); /* \\d means digit */

        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        System.out.println("metacharacters D...."); /* \\D means non-digit */

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)
    }
}
