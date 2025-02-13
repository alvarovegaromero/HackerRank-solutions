//https://www.hackerrank.com/challenges/tree-huffman-decoding/problem

    /*  
        class Node
            public  int frequency; // the frequency of this tree
            public  char data;
            public  Node left, right;
        
    */
    
	void decode(String s, Node root) { 
        int current_index = 0;
        Node current_node = root;
       
        while(current_index < s.length()) {
            if(s.charAt(current_index) == '0')
                current_node = current_node.left;            
            else
                current_node = current_node.right;
                         
            if(current_node instanceof HuffmanLeaf) {
                System.out.print(current_node.data);
                current_node = root;
            }
            
            current_index++;
        }       
    }