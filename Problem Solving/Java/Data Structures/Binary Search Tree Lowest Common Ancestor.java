//Link: https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem

/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
        
        if(root != null){

            //they are bigger than current value --> are at the right branch  
            if((v1 > root.data) && (v2 > root.data)) //their c
                return lca(root.right, v1,v2);

            //they are lower than current value --> at the left branch
            else if((v2 < root.data) && (v1 < root.data)) 
                return lca(root.left, v1,v2);
            else //their ways "splitted" --> last ancestor is this node
                return root;

        }
        
        return null;
    }
