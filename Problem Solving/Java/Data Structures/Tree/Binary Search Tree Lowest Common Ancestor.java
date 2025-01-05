//https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem

    /*
        class Node 
            int data;
            Node left;
            Node right;
	*/
    
	public static Node lca(Node root, int v1, int v2) {
        if(root != null){
            if((v1 > root.data) && (v2 > root.data)) 
                return lca(root.right, v1,v2);
            else if((v2 < root.data) && (v1 < root.data)) 
                return lca(root.left, v1,v2);
            else // last ancestor
                return root;
        }
        
        return null;
    }
