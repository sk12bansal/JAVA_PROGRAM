package program.Algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class TreeHeight
{
    // driver function to test the above functions
    public static void main(String args[])
    {

        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }

            Tree g = new Tree();

            System.out.println(g.heightIterative(root));
            t--;

        }
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
}
 */
class Tree
{
    int heightIterative(Node node)
    {
        // Your code here
        if(node == null)
            return 0;

        Queue<Node> q= new LinkedList<>();
        q.add(node);
        int height =0;
        while(true){
            int nodecount = q.size();
            if(nodecount == 0)
                return height;
            height++;
            while(nodecount>0){
                Node temp = q.peek();
                q.remove();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                nodecount--;
            }
        }
    }
    int heightRecursive(Node node)
    {
        // Your code here
        if(node == null){
            return 0;
        }else {
            int lheight = heightRecursive(node.left);
            int rheight = heightRecursive(node.right);
            return Math.max(lheight,rheight)+1;
        }
    }
}

