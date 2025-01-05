//https://www.hackerrank.com/challenges/tree-postorder-traversal/problem

/* 
    class Node {
        int data;
        Node left;
        Node right;
    }
*/

    public static void postOrder(Node root) {
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");   
        }        
    }
