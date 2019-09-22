package program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {
    public static void main(String args[]){
        String str = "hubLibrary";
        //String str = "hubHome";
        String partWord = "MyLibrary";
       // String partWord = "Home";
        //Pattern pattern = Pattern.compile("hub(\\w+)");
        //Matcher matcher = pattern.matcher(str);
        //System.out.println(matcher.group(1).toLowerCase());

        /*String pattern = "\\b"+partWord+"\\b";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(str);
        System.out.println(m.find());*/
        /*if(str.contains(partWord)){
            System.out.println(matcher.group(1).toLowerCase());
        }*/

        str = str.replaceFirst("hub", "");
        System.out.println(str);
        System.out.println(partWord.contains(str));
        //return m.find();
    }
}
