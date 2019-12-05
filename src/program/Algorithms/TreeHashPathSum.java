package program.Algorithms;


import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class TreeHashPathSum {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void diagonalPrint(TreeNode root)
    {
        //add your code here.
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode temp = q.peek();
            q.remove();
            if(temp==null){
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }else{
                while(temp!=null){

                    System.out.print(temp.data + " ");
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    temp = temp.right;
                }
            }
        }
    }
    static boolean hasPathSum(Node node,int sum){
        // Your code here
        if(node==null){
            return(sum==0);
        }else{
            boolean ans=false;
            int subsum=sum-node.data;
            if(subsum==0&&node.left==null&&node.right==null){
                return true;
            }

            if(node.left!=null){
                ans=ans||hasPathSum(node.left,subsum);
            }

            if(node.right!=null){
                ans=ans||hasPathSum(node.right,subsum);
            }
            return ans;
        }
    }
}
