package program.Algorithms;

class BST {
    /* This function should insert a new node with given data and
      return root of the modified tree  */
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    Node insert(Node root, int data) {
        // Your code here
        return insertRec(root, data);

    }

    Node search(Node root,int data){
            if(root == null || root.data == data){
                return root;
            }

            if(data>root.data){
                return search(root.right,data);
            }else{
                return search(root.left,data);
            }
    }

        int inorderSuccessor(Node root) {
            int minv = root.data;
            while (root.left != null) {
                minv = root.left.data;
                root = root.left;
            }
            return minv;
        }

        Node deleteNodeRec(Node root, int key) {
            if (root == null) {
                return root;
            }

            if (key < root.data) {
                root.left = deleteNodeRec(root.left, key);
            } else if (key > root.data) {
                root.right = deleteNodeRec(root.right, key);
            } else {
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;
                root.data = inorderSuccessor(root.right);

                root.right = deleteNodeRec(root.right, root.data);
            }
            return root;
        }

        Node deleteNode(Node root, int key) {
            // Your code here
            return deleteNodeRec(root, key);
        }
}}
