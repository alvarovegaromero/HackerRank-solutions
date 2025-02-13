//https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem

class Result {

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        
        if (llist == null)
            return node;
        
        if (llist.data >= data) {
            node.next = llist;
            llist.prev = node;
            return node;
        }
        
        DoublyLinkedListNode current = llist;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        
        node.next = current.next;
        
        if (current.next != null)
            current.next.prev = node;
        
        current.next = node;
        node.prev = current;

        return llist;
    }
}