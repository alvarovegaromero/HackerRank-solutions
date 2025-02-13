//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

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
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode next = llist;       
        
        for(int i = 0; i < position; i++) {
            previous = next;
            next = next.next;
        }
            
        previous.next = node;
        node.next = next;

        return llist;
    }