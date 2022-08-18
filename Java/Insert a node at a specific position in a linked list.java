//Link: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode previous_node = null;
        SinglyLinkedListNode next_node = llist;
        
        if(position == 0){ //New head
            node.next = next_node;
            return node;
        }            
        
        for(int i = 0 ; i < position ; i++){
            previous_node = next_node;
            next_node = next_node.next;
        }
            
        previous_node.next = node;
        node.next = next_node;

        return llist;
    }