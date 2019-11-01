
package program.Tree;


import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodeSameLevel {

    static class Node {
        int data;
        Node left;
        Node right;
        Node nextRight;

        Node(int d) {
            this.data = d;
            left = null;
            right = null;
            nextRight =null;

        }
    }

    public static void connect(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        root.nextRight = null;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node tmp = q.peek();
            q.remove();
            if(tmp!=null) {
                tmp.nextRight = q.peek();
                if (tmp.left != null) {
                    q.add(tmp.left);
                }
                if (tmp.right != null) {
                        q.add(tmp.right);
                }
            }else if(!q.isEmpty()){
                q.add(null);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        connect(root);


    }

}
