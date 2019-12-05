package program.Algorithms;

import java.util.*;

class Node1
{
    int data;
    Node1 left, right;
    Node1(int item)
    {
        data = item;
        left = right = null;
    }
}
class TreeLeftView {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node1> m = new HashMap<Integer, Node1> ();
            int n = sc.nextInt();
            Node1 root=null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                Node1 parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node1(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node1 child = new Node1(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
            Tree1 g = new Tree1();
            g.leftView(root);
            System.out.println();
            t--;
        }
    }
}
/*This is a function problem.You only need to complete the function given below*/
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree1
{
    void zigZagTraversal(Node1 root)
    {
        //Add your code here.
        if(root == null){
            return;
        }
        Stack<Node1> currLevel = new Stack<>();
        Stack<Node1> nextLevel = new Stack<>();
        currLevel.push(root);
        boolean leftToRight = true;
        while(!currLevel.isEmpty()){
            Node1 tmp = currLevel.peek();
            currLevel.pop();
            System.out.print(tmp.data+" ");
            if(leftToRight){
                if(tmp.left !=null){
                    nextLevel.push(tmp.left);
                }
                if(tmp.right !=null){
                    nextLevel.push(tmp.right);
                }
            }else{
                if(tmp.right !=null){
                    nextLevel.push(tmp.right);
                }
                if(tmp.left !=null){
                    nextLevel.push(tmp.left);
                }
            }

            if(currLevel.isEmpty()){
                leftToRight = !leftToRight;
                Stack<Node1> tmpStack = currLevel;
                currLevel = nextLevel;
                nextLevel = tmpStack;
            }
        }

    }

    void leftView(Node1 root)
    {
        // Your code here
        if(root == null){
            return;
        }

        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node1 tmp = q.peek();
            if(tmp != null){
                System.out.print(tmp.data + " ");
                while(q.peek()!=null){

                    if(tmp.left!=null){
                        q.add(tmp.left);
                    }
                    if(tmp.right!=null){
                        q.add(tmp.right);
                    }
                    q.remove();
                    tmp = q.peek();
                }
                q.add(null);
            }
            q.remove();
        }
    }
}