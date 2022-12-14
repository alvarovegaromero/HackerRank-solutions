//Link:  https://www.hackerrank.com/challenges/is-binary-search-tree/problem

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBSTMaxAndMin(Node root, int min, int max)
    {
        if(root == null) //If it is a leaf, is a BST tree
            return true;
        
        
        //If the current value is bigger than the max of the tree (or subtree) or lower than the min of the tree,           the tree is bad organized.
        //System.out.println(root.data+" min "+ min+" max "+ max);
        if(root.data < min || root.data > max)
        {
            //System.out.println("a");
            return false;
        }
                    
        return (checkBSTMaxAndMin(root.left, min, root.data-1) && checkBSTMaxAndMin(root.right, root.data+1, max));
    }

    boolean checkBST(Node root) {
        return checkBSTMaxAndMin(root, 0, 10000);
    }