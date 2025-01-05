//https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem

    /* Node is defined as :
    class Node 
        int data;
        Node left;
        Node right;
    */

	public static Node insert(Node root, int data) {
        if(root == null){ 
            Node node = new Node(data);
            node.left = null;
            node.right = null;
            root = node;
        }
        else if(root.data > data) // left branch
            root.left = insert(root.left, data); 
        else if(root.data < data) // right branch 
            root.right = insert(root.right, data);

        return root;        
    }