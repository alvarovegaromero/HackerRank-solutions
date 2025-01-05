//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Set<SinglyLinkedListNode> nodes1 = new HashSet<>();
        SinglyLinkedListNode current = head1;
        
        while(current != null){
            nodes1.add(current);
            current = current.next;
        }

        current = head2;
        
        while(current != null){
            if(nodes1.contains(current))
                return current.data;
            
            current = current.next;
        }    
        
        return -1;
    }