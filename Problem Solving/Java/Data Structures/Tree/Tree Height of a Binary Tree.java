//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    
	public static int height(Node root) {
        if(root == null)
            return -1; //The father of it, its height is 0
        else
            return (1+Math.max(height(root.left), height(root.right)));
        
    }
