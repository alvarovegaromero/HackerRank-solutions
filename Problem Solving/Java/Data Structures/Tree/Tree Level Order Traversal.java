//Link: https://www.hackerrank.com/challenges/tree-level-order-traversal/problem

/* 
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    
    public static int height(Node root) //height of a subtree
    {
        if(root == null)
            return -1;
        else{
            int leftheight = height(root.left);
            int rightheight = height(root.right);
            
            if(leftheight > rightheight)
                return leftheight+1;
            else
                return rightheight+1;
        }
    }
    
    public static void levelOrderHeight(Node root, int height){
        if(root != null)
        {
            if(height == 0)
                System.out.print(root.data+" ");
            else if (height > 0){
        //if height-1, in any moment, all with the same height, will reach 0 and print
                levelOrderHeight(root.left, height-1);
                levelOrderHeight(root.right, height-1); 
            }            
        }
    }
    
	public static void levelOrder(Node root) {
      if(root != null){         
          for(int i = 0 ; i <= height(root) ; i++)            
            levelOrderHeight(root, i);            
      }      
    }
