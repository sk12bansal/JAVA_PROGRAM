package program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexEx1 {

    public static void main(String args[]){
        String tskReqStr = "assembleproduct_astroRelease";

        Pattern pattern;

        if (tskReqStr.contains("assemble"))
            pattern = Pattern.compile("assemble(\\w+)(Release|Debug|BetaRelease|Production)");
        else
            pattern = Pattern.compile("generate(\\w+)(Release|Debug|BetaRelease|Production)");

        Matcher matcher = pattern.matcher(tskReqStr);

        if (matcher.find())
            System.out.println(matcher.group(0).toLowerCase());
        else {
            System.out.println( "NO MATCH FOUND");
        }
    }
}
