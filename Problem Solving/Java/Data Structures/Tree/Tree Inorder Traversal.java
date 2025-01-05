//https://www.hackerrank.com/challenges/tree-inorder-traversal/problem

/* 
    class Node {
        int data;
        Node left;
        Node right;
    }
*/

    public static void inOrder(Node root) {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }