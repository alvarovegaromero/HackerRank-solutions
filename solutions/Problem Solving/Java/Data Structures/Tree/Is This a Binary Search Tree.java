//https://www.hackerrank.com/challenges/is-binary-search-tree/problem

    /*
        class Node {
            int data;
            Node left;
            Node right;
        }
    */
    
    boolean checkBSTMaxAndMin(Node root, int min, int max) {
        if(root == null)
            return true;
        
        if(root.data < min || root.data > max)
            return false;
                    
        return (checkBSTMaxAndMin(root.left, min, root.data-1) && 
                checkBSTMaxAndMin(root.right, root.data+1, max));
    }

    boolean checkBST(Node root) {
        return checkBSTMaxAndMin(root, 0, 10000); // Constraint
    }