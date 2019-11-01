package program;


import java.util.*;
import java.lang.*;
import java.io.*;

class ExpBalnace {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<String> s = new Stack();
        while (t > 0) {
            String str = "(()";//sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                String tmp1 = String.valueOf(str.charAt(i));
                if (tmp1.equals("[") || tmp1.equals("{") || tmp1.equals("(")) {
                    s.push(tmp1);
                    continue;
                }

                if (s.empty()) {
                    flag =false;
                    return;
                }

                String tmp = "";
                switch (tmp1) {
                    case ")":
                        tmp = s.peek();
                        s.pop();
                        if (tmp.equals("]") || tmp.equals("}")) {
                            flag = false;
                            return;
                        }
                        break;
                    case "]":
                        s.pop();
                        if (tmp.equals(")") || tmp.equals("}")) {
                            flag = false;
                            return;
                        }
                        break;
                    case "}":
                        s.pop();
                        if (tmp.equals(")") || tmp.equals("]")) {
                            flag = false;
                            return;
                        }
                        break;
                }
            }
            if(s.empty()){
                flag = true;
            }else {
                flag = false;
            }
            //flag = s.empty();
            System.out.println(flag);
            t = t - 1;
        }
    }
}