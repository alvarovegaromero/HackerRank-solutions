//https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
    
    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

static boolean hasCycle(SinglyLinkedListNode head) {
        Set<SinglyLinkedListNode> nodeVisited = new HashSet<>();
        SinglyLinkedListNode current = head;
        
        while(current != null){
            if(nodeVisited.contains(current))
                return true;
            else 
                nodeVisited.add(current);
                
            current = current.next;   
        }
        
        return false; 
    }