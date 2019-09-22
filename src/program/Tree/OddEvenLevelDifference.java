package program.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class OddEvenLevelDifference {
    static class Node {
        int data;
        levelOrderTraversal.Node left;
        levelOrderTraversal.Node right;

        Node(int d) {
            this.data = d;
            left = null;
            right = null;

        }
    }

    public static void levelOrder(levelOrderTraversal.Node root) {
        if (root == null) {
            return;

        }

        Queue<levelOrderTraversal.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        boolean odd =false;
        int oddSum = root.data;
        int evenSum = 0;

        while (!q.isEmpty()) {
            levelOrderTraversal.Node curr = q.poll();
            if (curr == null) {
                odd = !odd;
                if (!q.isEmpty()) {
                    q.add(null);
                    //System.out.println();
                }
            } else {
                if (curr.left != null) {
                    if(odd){
                        oddSum +=curr.left.data;
                    }else {
                        evenSum += curr.left.data;
                    }
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    if(odd){
                        oddSum +=curr.right.data;
                    }else {
                        evenSum += curr.right.data;
                    }
                    q.add(curr.right);
                }
                //System.out.print(curr.data + " ");
            }
        }
        System.out.print(oddSum-evenSum);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        levelOrderTraversal.Node root = new levelOrderTraversal.Node(1);
        root.left = new levelOrderTraversal.Node(2);
        root.right = new levelOrderTraversal.Node(3);
        root.left.left = new levelOrderTraversal.Node(4);
        root.left.right = new levelOrderTraversal.Node(5);
        root.right.right = new levelOrderTraversal.Node(6);

        levelOrder(root);


    }
}
