package program.Algorithms;

import java.util.Scanner;
import java.util.Stack;

class SortStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0)
                s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        }
    }
}

/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
class GfG {
    static void sortedInsert(Stack<Integer> s, int ele) {

        if (s.isEmpty() || ele > s.peek()) {
            s.push(ele);
        } else {
            int temp = s.pop();
            sortedInsert(s, ele);
            s.push(temp);
        }
    }

    public Stack<Integer> sort(Stack<Integer> s) {
        //add code here.
        if (!s.isEmpty()) {
            int temp = s.pop();
            sort(s);
            sortedInsert(s, temp);
        }
        return s;
    }
}