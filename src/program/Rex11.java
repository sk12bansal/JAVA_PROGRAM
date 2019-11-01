package program;

import java.util.Stack;

public class Rex11 {
    static String[] braces(String[] values){

        int n=values.length;
        String[]res=new String[n];
        int c=0;
        while(c<n){
            Stack<String> s=new Stack<>();
            String exp=values[c];
            boolean flag=false;
            for(int i=0;i<exp.length();i++){
                if(String.valueOf(exp.charAt(i)).equals("(")||String.valueOf(exp.charAt(i)).equals("{")||String.valueOf(exp.charAt(i)).equals("[")){
                    s.push(String.valueOf(exp.charAt(i)));
                    continue;
                }

                if(s.empty()){
                    res[c]="NO";
                    break;
                }
                String top="";
                switch(String.valueOf(exp.charAt(i))){
                    case")":
                        top=s.peek();
                        s.pop();
                        if(top.equals("]")&&top.equals("}")){
                            flag=true;
                            res[c]="NO";
                        }
                        break;
                    case"]":
                        top=s.peek();
                        s.pop();
                        if(top.equals(")")&&top.equals("}")){
                            res[c]="NO";
                            flag=true;
                        }
                        break;
                    case"}":
                        top=s.peek();
                        s.pop();
                        if(top.equals("]")&&top.equals(")")){
                            res[c]="NO";
                            flag=true;
                        }
                        break;
                }

                if(flag){
                    break;
                }
            }
            if(s.empty()){
                res[c]="YES";
            }else{
                res[c]="NO";
            }
            c=c+1;
        }
        return res;
    }

    public static String compressedString(String message) {
        // Write your code here
        String res ="";
        Stack<String> s = new Stack<>();
        for(int i=message.length()-1;i>=0;i--){
            s.push(String.valueOf(message.charAt(i)));
        }
        while(!s.empty()){
            //System.out.println(s.size());
            String tmp = s.peek();
            //System.out.println(tmp);
            s.pop();
            int c =1;
            while(!s.empty() && tmp.equals(s.peek())){
                c++;
                s.pop();
            }
            if(c==1){
                res += tmp;
            }else {
                res += tmp + c+"";
            }
        }
        return res;
    }

    public static void main(String args[]){
        String [] values = new String [2];
       /* values[0] = "{}[]()";
        values[1] = "{[}]}";

        String res[] = braces(values);
        System.out.println(res.length);*/

       String res = compressedString("abbc");
        System.out.print(res);
       // System.out.println(res[1]);
     }

}

