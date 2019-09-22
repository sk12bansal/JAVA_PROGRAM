package program.Tree;


import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            left = null;
            right = null;

        }
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;

        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            } else {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                System.out.print(curr.data + " ");
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

        levelOrder(root);


    }

}
