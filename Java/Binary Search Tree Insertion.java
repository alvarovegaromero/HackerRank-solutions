//Link: https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem

/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root, int data) {
        //if we end up on an empty tree or at the position that we should be, then
        //  we insert it. Create the node and make it return (root of its new branch)
        if(root == null){ 
            Node node = new Node(data);
            node.left = null;
            node.right = null;
            root = node;
        }
        else if(root.data > data) //Should be at the left branch
            root.left = insert(root.left, data); 
            //the value of the left is the same root (the else if) or is the new node
        else if(root.data < data) //Should be at the right branch 
            root.right = insert(root.right, data);

        return root;        
    }

